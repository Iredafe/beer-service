package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum1 {

    public static List<List<Integer>> fourSum(int [] nums, int target){

        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 4) return result;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-3; i++){
            if(nums[i] == nums[i+1]) continue;
            for(int j= i+1; j < nums.length-2; j++){
                if(nums[j] == nums[j+1]) continue;
            int start = i+1;
            int end = nums.length-1;

            while(start < end){
                int sum = nums[i] + nums[j] + nums[start] + nums[end];
                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                    start++;
                    end--;
                    while(start < end && nums[start] == nums[start+1]) start++;
                    while(start<end && nums[end] == nums[end-1]) end--;
                }
                if(sum < target){
                    start++;
                }else{
                    end--;
                }
            }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        int target = 0;

        System.out.println("This is the result for 4 Sum : " + fourSum(nums, target));
    }
}
