package dafe.springframework.beerservice.Grokking;

public class AverageOfSubarrayOfSizeK {

    public static void main(String[] args) {
        double[] result = findAverages(5,
                new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
    }

}
