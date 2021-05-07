package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberSmallerThanTheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        //problem statement
        //input is an array of integers
        //output is an array containing the numbers smaller than the each item in the array

        //solution breakdown O(n^2)
        //initialize an empty arraylist for the result
        //loop through and compare for the numbers less than the current no
        //store the count and return it in an array
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j= nums.length-1; j>=i; j--){
                if(nums[i]>nums[j] && i!=j){
                    count++;
                }
            }
            result.add(count);
        }
        int index=0;
        int [] newArray = new int [result.size()];
    for(int n : result){
        newArray[index++]= n;
    }
    return newArray;
    }

    public static void main(String[] args) {

        int [] testInput1 = {8,1,2,2,3};
        int [] testInput2 ={6,5,4,8};
        int[] ans = smallerNumbersThanCurrent(testInput1);
        String answer = Arrays.toString(ans);
        int[] ans1 = smallerNumbersThanCurrent(testInput2);
        String answer1 = Arrays.toString(ans1);
        System.out.println("These are the counts of numbers smaller than each number in the array1 : " + answer);
        System.out.println("These are the counts of numbers smaller than each number in the array2 : " + answer1);
    }
}