package dafe.springframework.beerservice.dsAndAlgo;

/*

Given an array nums. We define a running sum of an array
as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

 */


public class RunningSum {

    public static int[] runningSum(int[] nums){
        int result[] = new int[nums.length] ;

        //initialize the first result
        result[0]= nums[0];
        for(int i=1; i< nums.length; i++){
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }

    public static int[] runningSum2(int[] nums){

        for(int i=1; i< nums.length;i++){
            nums[i] += nums[i-1];
        }
    return nums;
    }

    public static void main(String[] args) {

        int input1[]= {1,2,3,4};
        int input2[] ={3,1,2,10,1};

        System.out.println("this is the result of running sum of array " + runningSum(input1));
        System.out.println("this is the result of running sum of array " + runningSum(input2));

        System.out.println("this is the result " + input1);
        System.out.println("this is the result " + input2);

    }
}
