package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        //
        return quadruplets;
    }


    public static void main(String[] args) {

        int [] array = {7, 6, 4, -1, 1, 2};
        int target = 16;
        System.out.println("These are the four number sums : " + fourNumberSum(array, target));
    }
}
