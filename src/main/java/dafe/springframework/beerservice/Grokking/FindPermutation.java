package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.List;

public class FindPermutation {

    private static List<List<Integer>> findPermutations(int [] array){

        return new ArrayList<>();
    }
    public static void main(String[] args) {
        List<List<Integer>> result = findPermutations(new int[] { 1, 3, 5 });
        System.out.print("Here are all the permutations: " + result);
    }
}
