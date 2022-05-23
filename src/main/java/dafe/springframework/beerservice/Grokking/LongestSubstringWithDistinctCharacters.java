package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithDistinctCharacters {

    private static int findLength(String input){

        HashMap<Character, Integer> window = new HashMap<>();
        int left=0;
        int length=0;

        for(int right=0; right<input.length(); right++){
            char character = input.charAt(right);

            if(window.containsKey(character)){
                left = Math.max(left, window.get(character)+1);
            }
            window.put(character, right);

            length = Math.max(length, right-left+1);
        }

        return length;
    }

    public static void main(String[] args) {
//        System.out.println("Length of the longest substring: "
//                + findLength("aabccbb"));
//        System.out.println("Length of the longest substring: "
//                + findLength("abbbb"));
        System.out.println("Length of the longest substring: "
                + findLength("abccde"));
    }
}
