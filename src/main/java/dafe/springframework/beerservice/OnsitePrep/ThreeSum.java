package dafe.springframework.beerservice.OnsitePrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public static List<List<Integer>> threeSum(int nums[]){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i< nums.length && nums[i] <=0 ; i++){
            if(i==0 || nums[i] != nums[i-1]){
                twoSum(i, nums, result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int array[] = {-1,0,1,2,-1,-4};
        System.out.println("These are the 3 numbers that sum up to zero: " + threeSum(array));
    }

}
