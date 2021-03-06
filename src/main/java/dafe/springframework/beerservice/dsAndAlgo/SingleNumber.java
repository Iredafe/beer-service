package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};

        System.out.println("This is the single number : " + singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        return list.get(0);

    }
}
