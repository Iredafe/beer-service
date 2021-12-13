package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int [] array) {
        quickSortHelper(array, 0, array.length-1);
        return array;
    }

    public static void quickSortHelper(int [] array, int startIdx, int endIdx){
        int pivotIdx = startIdx;
        int leftIdx = startIdx+1;
        int rightIdx = endIdx;
        if(startIdx >= endIdx) return ;
     while (rightIdx >= leftIdx){
       if(array[leftIdx] > array[pivotIdx] && array[rightIdx] < array[pivotIdx]){
             swap(array, leftIdx, rightIdx);
         }
         if(array[leftIdx] <= array[pivotIdx]){
             leftIdx++;
         }
         if(array[rightIdx] >= array[pivotIdx]){
             rightIdx--;
         }
         swap(array, pivotIdx, rightIdx);
         boolean isLeftSubArraySmaller = rightIdx -1 - startIdx < endIdx - (rightIdx);
         if(isLeftSubArraySmaller){
             quickSortHelper(array, startIdx, rightIdx-1);
             quickSortHelper(array, rightIdx+1, endIdx);
         }else{
             quickSortHelper(array, rightIdx+1, endIdx);
             quickSortHelper(array, startIdx, rightIdx-1);
         }
     }
    }

    public static void swap(int [] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int [] input ={8, 5, 2, 9, 5, 6, 3};

        System.out.println("This is the quick sort result : " + Arrays.toString(quickSort(input)));
    }
}
