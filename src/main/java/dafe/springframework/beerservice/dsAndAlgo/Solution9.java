package dafe.springframework.beerservice.dsAndAlgo;

import java.util.*;

public class Solution9 {
        public static boolean containsDuplicate(int[] nums) {
            //problem statement
            //input is an array
            //output is a boolean
            //return true if theer is a duplicate in the array
            //return false if there i s no duplicate


            //solution statemnt: expensive soln O(n^2)
            //use 2 pointer
            //iterate through the arraywith each pointer
            //if there is a duplicate, return true
            //else return false
            boolean isDuplicate = false;
            for(int i=0; i< nums.length; i++){
                for(int j=nums.length-1; j>i;j--){
                    if(nums[i]==nums[j] ){
                        isDuplicate = true;
                    }
                }
            }
            return isDuplicate;
        }

    public static boolean containsDuplicate1(int[] nums) {
            //sorting method O(n log n)
            //sort array
            //check if there is any duplicate between any 2 numbers in sorted array
            Arrays.sort(nums);
            for (int i=1; i< nums.length; i++){
                if(nums[i]==nums[i-1])
                    return true;
            }
    return false;
        }

    public static boolean containsDuplicate2(int[] nums) {
//use a Hashtable O(n)
        Set<Integer> mySet = new HashSet<>();
        for(int n: nums){
            if(mySet.contains(n)) return true;
            mySet.add(n);
            }
        return false;
    }

        public static void main(String[] args) {
            int [] nums= {1,2,3,4,3,1};
            System.out.println("Answer for linear search is : " + containsDuplicate(nums));
            System.out.println("Answer from sorting is : " + containsDuplicate1(nums));
            System.out.println("Answer from hashmap is : " + containsDuplicate2(nums));
        }
}
