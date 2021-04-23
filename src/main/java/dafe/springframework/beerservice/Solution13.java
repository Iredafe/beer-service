package dafe.springframework.beerservice;

import java.util.Arrays;

public class Solution13 {
    public static int binarySearch(int[] nums, int target) {

        //problem statement:
        //input is an array of unsorted integers and a target number
        //output should be the index of the target number in the array if the target number is found
        //if the target is not found return -1

        //solution plan
        //sort the array
        //use binary search algorithm
        //find the middle of the array
        //if the target is less than the mid value, search the left array
        //if target is greater than the mid value, search the right of the array
        // return the index if found
        //return -1 if index not found

        int leftOfArray =0;
        int rightOfArray = nums.length-1;
        int midOfArray;

        Arrays.sort(nums);
        while(leftOfArray<=rightOfArray){
            midOfArray = leftOfArray + ((rightOfArray-leftOfArray)/2);

            if(nums[midOfArray] < target){
                leftOfArray= midOfArray+1;
            }
            else if(nums[midOfArray] > target){
                rightOfArray=midOfArray-1;
            }
            else return midOfArray;
        }

    return -1;
    }


    public static void main(String[] args) {

        int target = 9;
        int[] nums = new int[]{3, 2, 1, 4, 7, 9, 8, 15, 34, 6, 0};
        System.out.println("This is the index of the searched item : " + binarySearch(nums, target));
    }

}