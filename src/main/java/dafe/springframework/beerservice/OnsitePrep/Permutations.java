package dafe.springframework.beerservice.OnsitePrep;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int [] array){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int number : array){
            list.add(number);
        }
        getAllPermutations(list, result, 0);
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println("These are the permutations : " + permute(nums));
    }
}
