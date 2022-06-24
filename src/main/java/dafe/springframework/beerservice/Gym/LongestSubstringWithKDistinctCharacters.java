package dafe.springframework.beerservice.Gym;

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
                window.put(character, window.get(character)-1);
                if(window.get(character)==0){
                    window.remove(character);
                }
                left++;
            }

            lengthOfSubstring = Math.max(lengthOfSubstring, right-left+1);
        }
        return lengthOfSubstring == Integer.MIN_VALUE ? 0 : lengthOfSubstring;
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
