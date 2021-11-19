package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ClassPhotos {

    public static boolean isClassPhotosPossible(ArrayList <Integer> redShirts, ArrayList<Integer> blueShirts){
       Collections.sort(redShirts,Collections.reverseOrder());
        Collections.sort(blueShirts, Collections.reverseOrder());
       String shirtForFirstRow = redShirts.get(0) < blueShirts.get(0) ? "RED" : "BLUE";

       for (int index = 0; index< redShirts.size(); index++){
          if(shirtForFirstRow == "RED"){
              if(redShirts.get(index) >= blueShirts.get(index)){
                  return false;
              }
          }else if(blueShirts.get(index) >= redShirts.get(index)){
                  return false;
              }

       }
        return true;
    }


    public static void main(String[] args) {


        ArrayList<Integer> redShirtHeights = new ArrayList<>();
        redShirtHeights.add(6);
        redShirtHeights.add(9);
        redShirtHeights.add(2);
        redShirtHeights.add(4);
        redShirtHeights.add(5);
                //{6, 9, 2, 4, 5};
        ArrayList<Integer> blueShirtHeights = new ArrayList<>();
        blueShirtHeights.add(5);
        blueShirtHeights.add(10);
        blueShirtHeights.add(1);
        blueShirtHeights.add(3);
        blueShirtHeights.add(4);

        //{5, 8, 1, 3, 4};
        boolean answer = isClassPhotosPossible(redShirtHeights,blueShirtHeights);

        System.out.println("Is the class photo possible to do successfully ? " + answer);

    }
}
