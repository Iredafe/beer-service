package dafe.springframework.beerservice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        //problem statement
        //input is an array of integers
        //output os an integer
        //find the pair that has num[i]==num[j] and i<j

        //solution plan (iterative method with time complexity O(n^2))
        //initialize the number of good pair variable - counter
        //loop through the array
        //find the good pair
        //increment the counter when you get a match
        //return the count
        int counter=0;
        for(int i=0; i<nums.length; i++){
            for(int j=nums.length-1; j>i; j--){
                if(nums[i]==nums[j] && i<j){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int numIdenticalPairsHash(int[] nums) {

        int counter=0;
        Map<Integer,Integer> myHashMap = new HashMap<>();
        for(int num:nums){
            Integer frequency = myHashMap.get(num);
            if(frequency ==null){
                myHashMap.put(num,1);
            }else{
                counter+=frequency;
                myHashMap.put(num, frequency+1);
            }
        }
    return counter;
    }

        public static void main(String[] args) {
        int testArray []= {9,2,4,2,5,7,5,3,4,1,0,3,2,5};
        int testArray2 [] = {1,2,3,1,1,3};
        System.out.println("This is the number of good pairs : " + numIdenticalPairs(testArray));
        System.out.println("This is the number of good pairs : " + numIdenticalPairs(testArray2));
        System.out.println("This is the number of good pair in hashmap " + numIdenticalPairsHash(testArray));
        System.out.println("This is the number of good pair in hashmap " + numIdenticalPairsHash(testArray2));
        }
}