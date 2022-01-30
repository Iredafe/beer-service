package dafe.springframework.beerservice.dsAndAlgo;

public class ThreeSumClosest {

    private static int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        for(int i=0; i< nums.length-2; i++){
            sum+=twoSumSmaller(nums, i+1, target-nums[i]);
        }
        return sum;
    }

    private static int twoSumSmaller(int[] nums, int i, int target) {
        int sum=0;

        return sum;
    }


    public static void main(String[] args) {
        int nums[] ={-1,2,1,-4};
        int target = 1;

        System.out.println("This is the closest 3sum : " + threeSumClosest(nums, target));
    }

}
