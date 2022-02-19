package dafe.springframework.beerservice.dsAndAlgo;

public class TwoSumSorted {

    public static void main(String[] args) {
        int [] nums = {2, 3, 5, 8, 11, 15};
        int target = 5;

        System.out.println("These are the index that sum to the target : " + twoSumSorted(nums, target));
    }

    private static int[] twoSumSorted(int[] nums, int target) {
        int left = 0; int right = nums.length-1;
        while (left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left, right};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}
