package dafe.springframework.beerservice.Grokking;

import java.util.List;

public class FindPermutation {

    public static void main(String[] args) {
        List<List<Integer>> result = findPermutations(new int[] { 1, 3, 5 });
        System.out.print("Here are all the permutations: " + result);
    }
}
