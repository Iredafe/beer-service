package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class SubArraySort {

    //find all the unsorted numbers
    //find the smallest and greatest numbers
    //find their final sorted position on the array
     public static int[] subArraySort(int [] array){
         int minOutOfOrder = Integer.MAX_VALUE;
         int maxOutOfOrder = Integer.MIN_VALUE;
         for(int i=0; i<array.length; i++){
             int num = array[i];
             if(isOutOfOrder(i, num, array)){
                 minOutOfOrder = Math.min(minOutOfOrder, num);
                 maxOutOfOrder = Math.max(maxOutOfOrder, num);
             }
         }
         if(minOutOfOrder == Integer.MAX_VALUE) return new int[]{-1,-1};
         int subArrayLeftIdx = 0;
         while (minOutOfOrder >= array[subArrayLeftIdx]) subArrayLeftIdx++;
         int subArrayRightIdx = array.length-1;
         while(maxOutOfOrder <= array[subArrayRightIdx]) subArrayRightIdx--;
         return new int[] {subArrayLeftIdx, subArrayRightIdx};
     }

     public static boolean isOutOfOrder(int i, int num, int[] array){
         if(i == 0) return num > array[i+1];
         if(i == array.length-1) return num < array[i-1];
         return num > array[i+1] || num < array[i-1];
     }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        System.out.println("This is the sub array : " + Arrays.toString(subArraySort(input)));
    }
}
