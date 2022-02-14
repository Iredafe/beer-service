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
    int i =0;
    int j=0;
    int k=0;
    int [] sortedArray = new int[leftHand.length + rightHand.length];
        while(i<leftHand.length && j< rightHand.length ){
            if(leftHand[i] <= rightHand[j]){
                sortedArray[k++] = leftHand[i++];
            }else{
                sortedArray[k++] = rightHand[j++];
            }
        }
        while (i<leftHand.length){
            sortedArray[k++] = leftHand[i++];
        }
        while (j< rightHand.length){
            sortedArray[k++] = rightHand[j++];
        }

        return sortedArray;
    }

    public static void main(String[] args) {

        int [] input = {9,3,5,2,1,3,5,8,7};
        System.out.println("This is the sorted result : " + Arrays.toString(mergeSort(input)));
    }
}
