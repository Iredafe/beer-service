package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int [] nums ={0,1,0,3,12};
        int [] nums1 ={0,1,0,3,12};
        System.out.println("This is the result : " + Arrays.toString(moveZeroes(nums)));
        System.out.println("This is the result with 2 pointers: " + Arrays.toString(moveZeroesWithSwap(nums1)));
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
        int slow = 0;
        for(int fast = 0; fast<nums.length; fast++){
            if(nums[fast]!=0) {
                swap(nums, slow, fast);
                slow++;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int slow, int fast) {
        int temp = nums[slow];
        nums[slow] = nums[fast];
        nums[fast] = temp;
    }
}
