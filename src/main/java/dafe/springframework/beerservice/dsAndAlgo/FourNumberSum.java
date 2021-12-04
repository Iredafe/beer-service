package dafe.springframework.beerservice.dsAndAlgo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

public class FourNumberSum {
        //create a variable to store the quadruplets and another one to keep track of the pairs
        // loop through the array, and create a current sum starting from the second index
        // find the difference between the current sum and target sum
        //check the hashmap to see it the difference exists
        //if the difference exists, add the pair to the quadruplet
        //if it does not exist, do nothing
        //do another for loop, create another current sum variable, check if the sum is in the hashmap
        //if it exists in the hashmap, append/add to the hashmap, if it doesn't, set it into the hashmap
    public static List<Integer[]>  fourNumberSum(int [] array, int targetSum){
        Map<Integer, List<Integer[]>> allPairsSum = new HashMap<>();
        List<Integer[]> quadruplets = new ArrayList<>();

        for(int i=1; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                int currentSum = array[i] + array[j];
                int difference = targetSum - currentSum;
                if(allPairsSum.containsKey(difference)){
                    for(Integer[] pairs : allPairsSum.get(difference)){
                        Integer []newQuadruplet = {pairs[0], pairs[1], array[i], array[j]};
                        quadruplets.add(newQuadruplet);
                    }
                }
            }
            for(int k=0; k<i; k++){
                int currentSum = array[i] + array[k];
                Integer [] pairs = {array[k], array[i]};
                if(!allPairsSum.containsKey(currentSum)){
                    List<Integer[]> pairGroup = new ArrayList<>();
                    pairGroup.add(pairs);
                     allPairsSum.put(currentSum, pairGroup);
                }else{
                    allPairsSum.get(currentSum).add(pairs);
                }
            }
        }

        return quadruplets;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {

        //create a variable to store the four sums
        //create an object to store the different pairs in key-value
        //loop through the array with a nested for loop with the first pointer starting from the second index
        //create a variable for the current sum
        //find the difference between the currentsum and targetsum
        //check the key-value object to see if the difference is contained there
        //if it is contained, loop through the object and add the pair where it belongs
        //if it is not contained, do nothing
        //do another loop through the array this time with a third pointer that starts at the first index
        //create a variable to store the currentsum and pairs inside the loop
        //check the key-value object to see if the current sum exists in there
        //if it does not exist, put it in
        // if it exists, add the new pairs to the values already mapped to the key in the  object
        //return the four sum in a list


        //figure this out
        List<List<Integer>> fourSums = new ArrayList<>();
        Map<Integer, List<List<Integer>>> bucket = new HashMap<>();

        for(int i=1; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int currentSum = nums[i] + nums[j];
                int difference = target - currentSum;

                if(bucket.containsKey(difference)){
                    for(List<Integer> pair : bucket.get(difference)){
                        List<List<Integer>> newValues = new ArrayList<>();
                        newValues.add(pair.get(0,1));
                        newValues.add(pair.get(1));
                        newValues.add(pair.get(nums[i]));
                        newValues.add(pair.get(nums[j]));

                        fourSums.add(Arrays.asList(newValues));
                    }
                }
            }
            for(int k=0; k<i; k++){
                int currentSum = nums[k] + nums[i];
                Integer [] pair = {nums[k], nums[i]};

                if(bucket.containsKey(currentSum)){
                    bucket.get(currentSum).add(Arrays.asList(pair));
                }else{
                    List<Integer> pairList = new ArrayList<>();
                    pairList.add(Arrays.asList(pair));
                    bucket.put(currentSum, pairList);
                }
            }
        }

        return fourSum;
    }

    public static void main(String[] args) {

        int [] array = {7, 6, 4, -1, 1, 2};
        int target = 16;
        List<Integer[]> result =fourNumberSum(array, target);
        System.out.println("These are the four number sums : " + result);
    }
}
