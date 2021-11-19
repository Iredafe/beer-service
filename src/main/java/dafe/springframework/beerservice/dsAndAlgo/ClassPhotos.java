package dafe.springframework.beerservice.dsAndAlgo;

public class ClassPhotos {

    public static boolean isClassPhotosPossible(int[] redShirts, int [] blueShirts){

        return true;
    }


    public static void main(String[] args) {


        int [] redShirtHeights = {6, 9, 2, 4, 5};
        int [] blueShirtHeights ={5, 8, 1, 3, 4};
        boolean answer = isClassPhotosPossible(redShirtHeights,blueShirtHeights);

        System.out.println("Is the class photo possible to do successfully ? " + answer);

    }
}
