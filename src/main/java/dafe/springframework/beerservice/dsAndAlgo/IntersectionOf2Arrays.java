package dafe.springframework.beerservice.dsAndAlgo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

public class IntersectionOf2Arrays {


    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};

        System.out.println("This is the intersection : " + Arrays.toString(intersection(nums1, nums2)));
        System.out.println("This is the intersection : " + Arrays.toString(intersection(nums1, nums2)));
        System.out.println("This is the intersection : " + Arrays.toString(intersection(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int num:nums2){
            set2.add(num);
        }
        if(set2.size() > set1.size()) return setIntersection(set2,set1);
        else return setIntersection(set1,set2);
    }

    private static int[] setIntersection(HashSet<Integer> set1, HashSet<Integer> set2){
        int [] output = new int[set1.size()];
        int idx = 0;
        for(Integer num : set1){
            if(set2.contains(num)) output[idx++] = num;
        }

        return Arrays.copyOf(output, idx);
    }
}
