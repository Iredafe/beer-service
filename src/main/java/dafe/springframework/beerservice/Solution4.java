package dafe.springframework.beerservice;

public class Solution4 {
        public static int maxAscendingSum(int[] nums) {
            //problem analysis:
            //input is an array of numbers
            //output should be the sum of the sub array with max possible sum
            //a subarray is an ascending sequence of numbers in main array
            //we are not expected to sort the array of input
            //the output could be one element in a subarray with the highest value in an array [100, 10, 1]

            //solution breakdown:

            //intialize 2 pointers
            int currentValue = nums[0];
            int sumOfValues = nums[0];

            //using the 2 pointers, iterate over the array input and do a lookup for contiguous sequence
            for (int i=1; i < nums.length; i++) {
                //if sequence is ascending and sums up to max possible value, return the sum
                if (nums[i-1] < nums[i]) {
                    currentValue +=nums[i];
                    sumOfValues=currentValue;
                }
                //if sequence is not ascending, return the highest value on the array
                else {
                    currentValue = nums[i];
                }
            }
            return sumOfValues;
        }

        public static void main(String [] args){
            int findSum[] = {10,20,30,5,10,50};
            int findSum2[] = {100,10,1};
            int findSum3[] ={12,17,15,13,10,11,12};

            System.out.println("Max ascending sum is : " + maxAscendingSum(findSum) );
            System.out.println("Max ascending sum2 is : " + maxAscendingSum(findSum2) );
            System.out.println("Max ascending sum3 is : " + maxAscendingSum(findSum3) );
        }

    }
