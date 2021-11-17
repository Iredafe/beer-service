package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class MoveElementsToEnd {

public static int[] moveElement(int [] array, int target){

    return new int[]{};
}

    public static void main(String[] args) {

    int [] inputArray = {2, 1, 2, 2, 2, 3, 4, 2};
    int toMove = 2;

        int[] result = moveElement(inputArray, toMove);
        System.out.println("This is the array after moving " +toMove+ " to the end : " + Arrays.toString(result));
    }

}
