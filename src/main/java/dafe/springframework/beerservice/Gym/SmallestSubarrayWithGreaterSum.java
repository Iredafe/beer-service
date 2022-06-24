package dafe.springframework.beerservice.Gym;

public class SmallestSubarrayWithGreaterSum {

    private static int findMinSubArray(int s, int [] array){
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int window =0;

        for(int right=0; right < array.length; right++){
            window += array[left];

            while(window >= s){
                minLength = Math.min(minLength, right-left+1);
                window -= array[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
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
