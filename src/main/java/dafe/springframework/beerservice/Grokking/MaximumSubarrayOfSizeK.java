package dafe.springframework.beerservice.Grokking;

public class MaximumSubarrayOfSizeK {

    private static int findMaxSumSubArray(int k, int [] array){

        int maxSum = 0; int currentSum = 0;
        int start=0;

        for(int end=0; end < array.length; end++){
            currentSum += array[end];
            if(end >= k-1){
                maxSum= Math.max(maxSum, currentSum);
                currentSum -= array[start];
                start++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
                + findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }
}
