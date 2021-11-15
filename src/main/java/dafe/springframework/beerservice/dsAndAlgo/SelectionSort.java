package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array){
        for(int firstIndex=0; firstIndex<array.length; firstIndex++){
            int minimum  = firstIndex;
            for(int secondIndex = firstIndex+1; secondIndex< array.length; secondIndex++){
                if(array[secondIndex] < array[minimum]){
                    minimum=secondIndex;
                }
                swap(array, firstIndex, minimum);
            }
        }
        return array;
    }

    private static void swap(int[] array, int index, int minimum) {
        int temp = array[index];
        array[index] = array[minimum];
        array[minimum] = temp;
    }


    public static void main(String[] args) {

        int[] input = {8, 5, 2, 9, 5, 6, 3};
        int[] result = selectionSort(input);
        System.out.println("This is the new array of selection sorting : " + Arrays.toString(result));
    }
}
