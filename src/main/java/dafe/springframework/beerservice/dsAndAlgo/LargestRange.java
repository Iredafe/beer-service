package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class LargestRange {

    public static void main(String[] args) {
        int [] input = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        System.out.println("This is the largest range : " + largestRange(input));
    }

    private static int[] largestRange(int[] input) {

        int longestLength= 0;
        int [] bestRange = new int[2];
        Map<Integer, Boolean> map = new HashMap();

    }
}
