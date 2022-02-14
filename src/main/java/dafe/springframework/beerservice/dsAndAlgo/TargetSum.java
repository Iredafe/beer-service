package dafe.springframework.beerservice.dsAndAlgo;

public class TargetSum {
    static int count = 0;

    public static int targetSum(int [] nums, int target){
        calculateTargetSum(nums, 0, 0, target);
        return count;
    }

    public static void calculateTargetSum(int nums[], int i, int sum, int target){
        if(i== nums.length){
            if(sum==target){
                count++;
            }
        }else{
            calculateTargetSum(nums, i+1, sum + nums[i], target);
            calculateTargetSum(nums, i+1, sum - nums[i], target);
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println("The number of times is : " + targetSum(nums, target));
    }
}
