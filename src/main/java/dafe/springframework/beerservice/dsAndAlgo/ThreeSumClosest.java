package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class ThreeSumClosest {
    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int difference = Integer.MAX_VALUE;
        for(int i=0; i< nums.length; i++){
            int start = i+1;
            int end = nums.length - 1;

            while(start<end){
                sum = nums[i] + nums[start] + nums[end];
               if(Math.abs(target-sum) < Math.abs(difference)){
                   difference = target-sum;
               }else if(sum<target){
                   start++;
               }else{
                   end--;
               }

            }
        }
        return target-difference;
        }


    public static void main(String[] args) {
        int nums[] ={1,1,1,0};
        int target = -100;

        System.out.println("This is the closest 3sum : " + threeSumClosest(nums, target));
    }

}
