package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int [] array){
        if(array.length == 1) return array;
        int mid = array.length/2;
        int [] leftHalf = Arrays.copyOfRange(array, 0, mid);
        int [] rightHalf = Arrays.copyOfRange(array, mid, array.length);
        return mergeBothArrays(mergeSort(leftHalf), mergeSort(rightHalf));
    }

    private static int[] mergeBothArrays(int[] leftHand, int [] rightHand) {
    int i,j,k =0;
        while(i<leftHand.length && j< rightHand.length ){

        }

    }

    public static void main(String[] args) {

        int [] input = {9,3,5,2,1,3,5,8,7};
        System.out.println("This is the sorted result : " + mergeSort(input));
    }
}
