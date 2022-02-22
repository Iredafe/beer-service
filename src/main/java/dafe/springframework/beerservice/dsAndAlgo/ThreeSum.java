package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {

    public static List<Integer[]> threeNumberSum(int array[] ,int target){

        //create two pointers - left and right
        //set your index at a number and move th pointers while adding the numbers in each pointer
        //if these numbers are equal to the target, add them into an array and add the array to the List,
        // increment left and decrement right.
        //if the sum is greater than the target, decrement right pointer
        //if the sum is less than target, increment left pointer
        int left = 1, right = array.length-1;
        List <Integer[]> result = new ArrayList<>();
        Arrays.sort(array);
        for(int index=0; index<array.length-2; index++){
        while (left<right){

                int currentSum = array[left] + array[right] + array[index] ;
                if(currentSum==target){
                    Integer[] triplets = new Integer[]{array[index], array[left],array[right]};
                    result.add(triplets);
                    left++;
                    right--;
                } else if(currentSum < target) left++;
                else if(currentSum>target) right--;
            }
        }

        return result;
    }

    public static List<List<Integer>> threeSum2(List<Integer> array){

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int array[] = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;
        List<Integer[]> result =threeNumberSum(array,target);
        String newResult = result.toString();
        System.out.println("The three number sums are : " + newResult);
    }
}
