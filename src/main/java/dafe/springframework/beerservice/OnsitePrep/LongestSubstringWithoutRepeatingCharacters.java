package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int longestSubstring(String input){
        int left=0; int right=0; int maxLength=0;
        Map<Character, Integer> slidingWindow = new HashMap();
        while(right < input.length()){
            char character = input.charAt(right);
            if(slidingWindow.containsKey(character)){

            }
        }

        return maxLength;
    }
}
