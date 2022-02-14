package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int [] array){

        int mid = array.length/2;
        int [] leftHalf = Arrays.copyOfRange(array, 0, mid);
        int [] rightHalf = Arrays.copyOfRange(array, mid, array.length);
        return new int[]{};
    }

    public static void main(String[] args) {

        int [] input = {9,3,5,2,1,3,5,8,7};
        System.out.println("This is the sorted result : " + mergeSort(input));
    }
}
