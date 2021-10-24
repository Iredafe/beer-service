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

    public static void main(String[] args) {
        int input []= {1, 2, 3, 5, 6, 8, 9};
        int []output =sortedSquaredArray(input);
        int input1 []= {-5, -4, -3, -2, -1};
        int []output1 =sortedSquaredArray(input1);
        System.out.println(Arrays.toString(output));
        System.out.println(Arrays.toString(output1));
    }
}
