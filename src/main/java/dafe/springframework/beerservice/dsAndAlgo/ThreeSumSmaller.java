package dafe.springframework.beerservice.dsAndAlgo;

public class ThreeSumSmaller {

    public static int threeSumSmaller(int [] nums , int target){
        int sum =0;
        for(int i=0; i<nums.length-2; i++){
            sum+= binarySearch(nums, i+1, target-nums[i]);
        }
        return sum;
    }

    private static int binarySearch(int[] nums, int i, int j) {

    }

    public static void main(String[] args) {
        int [] nums = {-2,0,1,3};
        int target = 2;

        System.out.println(threeSumSmaller(nums, target));
    }
}
