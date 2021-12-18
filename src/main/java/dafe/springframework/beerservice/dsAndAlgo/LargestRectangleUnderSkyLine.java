package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

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

    public static int largestRectangleUnderSkyline(List<Integer> buildings){

        Stack<Integer> indices = new Stack<>();
        int maxArea = 0;
        ArrayList<Integer> extendedBuildings = new ArrayList<>(buildings);
        extendedBuildings.add(0);
        for(int i=0; i< extendedBuildings.size(); i++){
            int height = extendedBuildings.get(i);
            while(!indices.isEmpty() && extendedBuildings.get(indices.peek()) >= height){
                int pillarHeight = extendedBuildings.get(indices.pop());
                int width = (indices.isEmpty()) ? i : i-indices.peek() - 1;
                maxArea = Math.max(width * pillarHeight, maxArea);
            }
            indices.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {

        ArrayList<Integer> buildings = new ArrayList<>(Arrays.asList(1, 3, 3, 2, 4, 1, 5, 3, 2));

        System.out.println("This is the largest rectangle : " + largestRectangle(buildings));
        System.out.println("This is the largest rectangle : " + largestRectangleUnderSkyline(buildings));
    }
}
