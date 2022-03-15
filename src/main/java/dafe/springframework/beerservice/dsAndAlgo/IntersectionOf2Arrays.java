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

        return null;
    }

    private static int[] setIntersection(HashSet<Integer> set1, HashSet<Integer> set2){
        int [] output = new int[set1.size()];
        int idx = 0;
        for(Integer num : set1){
            if(set1.contains(num)) output[idx++] = num;
        }
    }
}
