package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class FourSum1 {

    public static List<List<Integer>> fourSum(int [] nums, int target){

        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 4) return result;
        return result;
    }


    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        int target = 0;

        System.out.println("This is the result for 4 Sum : " + fourSum(nums, target));
    }
}
