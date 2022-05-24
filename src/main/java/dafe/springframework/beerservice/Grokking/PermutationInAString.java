package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;

public class PermutationInAString {

    private static boolean findPermutation(String word, String pattern){

        HashMap<Character, Integer> characterFrequencymap = new HashMap<>();

        return false;
    }
    public static void main(String[] args) {
        System.out.println("Permutation exist: "
                + findPermutation("oidbcaf", "abc"));
        System.out.println("Permutation exist: "
                + findPermutation("odicf", "dc"));
        System.out.println("Permutation exist: "
                + findPermutation("bcdxabcdy", "bcdyabcdx"));
        System.out.println("Permutation exist: "
                + findPermutation("aaacb", "abc"));
    }
}
