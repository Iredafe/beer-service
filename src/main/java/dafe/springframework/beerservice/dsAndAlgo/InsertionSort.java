package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array){

        for(int i = 1; i< array.length; i++){
            int j = i;
            while(j >0 && array[j] < array[j-1]){
                swap(array, j, j-1);
                j--;
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {


        int [] input = {8, 5, 2, 9, 5, 6, 3};
        int [] result = insertionSort(input);
        System.out.println("This is the sorted array : " + Arrays.toString(result));
    }
}
