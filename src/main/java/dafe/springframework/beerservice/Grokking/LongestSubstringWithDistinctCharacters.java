package dafe.springframework.beerservice.Grokking;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithDistinctCharacters {

    private static int findLength(String input){

        Set<Character> window = new HashSet<>();
        int left=0;
        int length=0;

        for(int right=0; right<)

    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: "
                + findLength("aabccbb"));
        System.out.println("Length of the longest substring: "
                + findLength("abbbb"));
        System.out.println("Length of the longest substring: "
                + findLength("abccde"));
    }
}
