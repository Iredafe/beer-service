package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.List;

public class SubarraysWithProductLessThanTarget {

    static List<List<Integer>> findSubarrays(int [] array, int target){
        List<List<Integer>> subarrays= new ArrayList<>();
        for(int index=0; index<array.length; index++){

            int left=index+1; int right=array.length-1;
            while (left<=right){
                int product = left*right;
            }
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
