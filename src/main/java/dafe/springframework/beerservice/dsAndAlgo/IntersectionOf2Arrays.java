package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOf2Arrays {


    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};

        System.out.println("This is the intersection : " + intersection(nums1, nums2));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        int [] result = new int[]{};
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();

        for(int num : nums1){
            first.add(num);
        }

        for(int i=0; i< nums2.length; i++){
            if(first.contains(i)){
                result[i++] = nums2[i];
            }
        }
        return result;
    }
}
