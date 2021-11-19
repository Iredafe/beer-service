package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class ClassPhotos {

    public static boolean isClassPhotosPossible(int[] redShirts, int [] blueShirts){
        Arrays.sort(blueShirts);
        Arrays.sort(redShirts);
       String shirtForFirstRow = redShirts[0] < blueShirts[0] ? "RED" : "BLUE";

       for (int index = 0; index< redShirts.length; index++){
          if(shirtForFirstRow == "RED"){
              if(redShirts[index] >= blueShirts[index]){
                  return false;
              }
          }else if(blueShirts[index] >= redShirts[index]){
              return false;
          }
       }
        return true;
    }


    public static void main(String[] args) {


        int [] redShirtHeights = {6, 9, 2, 4, 5};
        int [] blueShirtHeights ={5, 8, 1, 3, 4};
        boolean answer = isClassPhotosPossible(redShirtHeights,blueShirtHeights);

        System.out.println("Is the class photo possible to do successfully ? " + answer);

    }
}
