package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array){

        for(int index=0; index<array.length; index++){
            int minimum  = index;
            for(int secondIndex = index+1; secondIndex< array.length; secondIndex++){
                if(array[secondIndex] < array[minimum]){
                    minimum=secondIndex;
                }
                swap(array, index, minimum);
            }
        }
        return array;
    }

    private static void swap(int[] array, int index, int minimum) {
        int temp = array[index];
        array[index] = array[minimum];
        array[minimum] = temp;
    }


    public static int[] selectionSort2(int[] array) {

        int startIndex = 0;
        while(startIndex<array.length-1){
            int minimum = startIndex;
            for(int index=startIndex+1; index < array.length; index++){
                if(array[minimum] > array[index]){
                    minimum=index;
                }
            }
            swap(array, startIndex, minimum);
            startIndex++;
        }

        return array;
    }
    public static void main(String[] args) {

        int[] input = {8, 5, 2, 9, 5, 6, 3};
        int [] input2 ={4, 1, 5, 0, -9, -3, -3, 9, 3, -4, -9, 8, 1, -3, -7, -4, -9, -1, -7, -2, -7, 4};
        int[] result = selectionSort(input);
        int[] result2 = selectionSort2(input2);
        System.out.println("This is the new array of selection sorting : " + Arrays.toString(result));
        System.out.println("This is the new array of selection sorting : " + Arrays.toString(result2));
    }
}
