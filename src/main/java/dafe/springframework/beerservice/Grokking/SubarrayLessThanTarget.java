package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.List;

public class SubarrayLessThanTarget {

    private static List<List<Integer>> findSubarrays(int [] array, int target){
        List<List<Integer>> output = new ArrayList<>();

        int left = 0;

        for(int right=0; right<array.length; right++){

        }
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        System.out.println(
              findSubarrays(new int[] { 2, 5, 3, 10 }, 30));
        System.out.println(
                findSubarrays(new int[] { 8, 2, 6, 5 }, 50));
    }
}
