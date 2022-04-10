package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int longestSubstring(String input){
        int left=0; int right=0; int maxLength=0;
        Set<Character> slidingWindow = new HashSet<>();
        while(right < input.length()){
            char character = input.charAt(right);
            if(slidingWindow.contains(character)){
                left++;
            }
            slidingWindow.add(character);
            right++;
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}
