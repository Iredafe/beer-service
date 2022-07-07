package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubarrayLessThanTarget {

    private static List<List<Integer>> findSubarrays(int [] array, int target){
        List<List<Integer>> output = new ArrayList<>();
        double product = 1;
        int left = 0;

        for(int right=0; right<array.length; right++){
            product *= array[right];

            while (product >= target && left<array.length){
                product/=array[left];
                left++;
            }
        }

        List<List<Integer>> list = new LinkedList<>();
        list.add(array[])
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        System.out.println(
              findSubarrays(new int[] { 2, 5, 3, 10 }, 30));
        System.out.println(
                findSubarrays(new int[] { 8, 2, 6, 5 }, 50));
    }
}
