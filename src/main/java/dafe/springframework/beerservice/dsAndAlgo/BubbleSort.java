package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int [] array){
        if(array.length==0){
            return new int[]{};
        }
        boolean isSorted = false;
        while (!isSorted){
            isSorted=true;
            for(int firstIndex=0; firstIndex<array.length-1; firstIndex++){
                if(array[firstIndex] > array[firstIndex+1]){
                    swap(array, firstIndex, firstIndex+1);
                isSorted=false;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array){
        for(int i=0; i< array.length; i++){
            int minIndex=i;
            for(int j=i+1; j<array.length; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
                swap(array, i, minIndex);
            }
        }
        return array;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {

        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex]=temp;
    }

    public static void main(String[] args) {
        int [] array = new int[]{8, 5, 2, 9, 5, 6, 3};
        int [] result = bubbleSort(array);
        System.out.println("This is the sorted array : " + Arrays.toString(result));
    }
}
