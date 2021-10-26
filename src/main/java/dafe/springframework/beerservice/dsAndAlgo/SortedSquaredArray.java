package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortedSquaredArray {

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
//		initialize a variable for storing the square
        //loop through the sorted array
        // perform the square operation for each index in the array
        // return the new array with square values sorted
    int[] result = new int[array.length];
        for (int i=0;i<array.length;i++){
            int squared = array[i]*array[i];
            result[i]=squared;
        }

        Arrays.sort(result);
        return result;
    }

    public static int [] sortedSquaredArray2(int [] array){
        int [] sortedSquareArray = new int[array.length];
        int i=0, j= array.length-1;
        for(int index= array.length-1; index>=0; index--){
        int smallerValue = array[i] , largerValue = array[j];
        if(Math.abs(smallerValue) > Math.abs(largerValue)){
            sortedSquareArray[index]= smallerValue*smallerValue;
            i++;
        }else{
            sortedSquareArray[index] = largerValue* largerValue;
            j--;
        }

        }

        return sortedSquareArray;
    }

    public static void main(String[] args) {


        System.out.println(Arrays.toString(sortedSquaredArray(new int[]{-5, -4, -3, -2, -1})));
        System.out.println("new sorted array is : " + Arrays.toString(sortedSquaredArray2(new int[]{-5, -4, -3, -2, -1})));
  System.out.println(Arrays.toString(sortedSquaredArray(new int[]{1, 2, 3, 5, 6, 8, 9})));
        System.out.println("new sorted array is : " + Arrays.toString(sortedSquaredArray2(new int[]{1, 2, 3, 5, 6, 8, 9})));
    }
}
