package dafe.springframework.beerservice.dsAndAlgo;

public class ThreeSumSmaller {

    public static int threeSum(int [] nums , int target){
        int sum =0;
        for(int i=0; i<nums.length-2; i++){
            sum+= twoSum(nums, i+1, target);
        }
        return sum;
    }

}
