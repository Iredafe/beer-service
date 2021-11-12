package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<Integer[]> threeNumberSum(int array[] ,int target){

        //create two pointers - left and right
        //set your index at a number and move th pointers while adding the numbers in each pointer
        //if these numbers are equal to the target, add them into an array and add the array to the List.
        int left = 1, right = array.length-1;
        List <Integer[]> result = new ArrayList<>();
        Arrays.sort(array);
        while (left<right){
            for(int index=0; index<array.length-3; index++){
                int currentSum = array[left] + array[right] + array[index] ;
               left++;
               right--;
                if(currentSum==target){
                    Integer[] triplets = new Integer[]{array[index], array[left],array[right]};
                    result.add(triplets);
                } else if(currentSum > array[left]) left++;
                else if(currentSum<array[right]) right--;
            }
        }

        return result;
    }
}
