package dafe.springframework.beerservice.Gym;

import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {

    private static double[] findAverages(int k, int [] array){
        double windowSum = 0; int left=0;
        double[] result =new double[array.length - k+1];

        for(int right = 0; right < array.length; right++){
            windowSum += array[right];

            if(right >= k-1){
                result[left] = windowSum/k;
                windowSum -= array[left];
                left++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        double[] result = findAverages(5,
                new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
    }

}
