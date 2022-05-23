package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;

public class LongestSubstringWithKDistinctCharacters {

    private static int findLength(String input, int k){
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0; int lengthOfSubstring = Integer.MIN_VALUE;

        for(int right=0; right<input.length(); right++){
            char character = input.charAt(right);
            window.put(character, window.getOrDefault(character, 0)+1);

            while(window.size() > k){
                character = input.charAt(left);
                if(window.get(character) ==0){
                    window.put(character, window.get(character)-1);
                }
            }

        }


        return lengthOfSubstring;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: "
                + findLength("araaci", 2));
        System.out.println("Length of the longest substring: "
                + findLength("araaci", 1));
        System.out.println("Length of the longest substring: "
                + findLength("cbbebi", 3));
    }
}
