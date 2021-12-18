package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestRectangleUnderSkyLine {


    public static int largestRectangle(ArrayList<Integer> buildings){
        int maxArea = 0;

      for(int index=0; index< buildings.size(); index++){

          Integer currentHeight = buildings.get(index);
          int furthestLeft = index;
          while(furthestLeft > 0 && buildings.get(furthestLeft-1) >= currentHeight){
              furthestLeft--;
          }

          int furthestRight = index;
          while(furthestRight < buildings.size()-1 && buildings.get(furthestRight+1) >= currentHeight){
              furthestRight++;
          }

          int areaWithLargestRectangle = (furthestRight-furthestLeft+1) * currentHeight;

          maxArea = Math.max(maxArea, areaWithLargestRectangle);
      }
        return maxArea;
    }

    public static void main(String[] args) {

        ArrayList<Integer> buildings = new ArrayList<>(Arrays.asList(1, 3, 3, 2, 4, 1, 5, 3, 2));

        System.out.println("This is the largest rectangle : " + largestRectangle(buildings));
    }
}
