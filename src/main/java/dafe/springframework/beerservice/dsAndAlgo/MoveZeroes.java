package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int [] nums ={0,1,0,3,12};
        System.out.println("This is the result : " + Arrays.toString(moveZeroes(nums)));
    }

    private static int[] moveZeroes(int[] nums) {
    int start=0; int end = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[start++] = nums[i];
            }
        }
        for(int i=start; i<nums.length; i++){
                nums[i] = 0;
            }
        return nums;
    }

    private static int[] moveZeroesWithSwap(int[] nums){

        return nums;
    }
}
