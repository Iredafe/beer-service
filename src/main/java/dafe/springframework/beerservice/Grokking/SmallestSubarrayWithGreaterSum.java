package dafe.springframework.beerservice.Grokking;

public class SmallestSubarrayWithGreaterSum {

    private static int findMinSubArray(int S, int [] array){
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int window =0;

        for(int right=0; right < array.length; right++){

        }
    }

    public static void main(String[] args) {
        int result = findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
        System.out.println("Smallest subarray length: " + result);
        result = findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
        System.out.println("Smallest subarray length: " + result);
        result = findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
        System.out.println("Smallest subarray length: " + result);
    }
}
