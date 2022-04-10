package dafe.springframework.beerservice.OnsitePrep;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMost2RepeatingCharacters {


    private static int longestSubstringWith2RepeatingCharacters(String string) {

        int left = 0;
        int right = 0;
        int maxLength=0;
        Map<Character, Integer> map = new HashMap();

        while(right < string.length()){
            char character = string.charAt(right);
            map.put(character, right);

            if(map.size() == 3){
                int smallestIndex = Collections.min(map.values());
                map.remove(string.charAt(smallestIndex));
                left = smallestIndex+1;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String string = "ccaabbb";
        System.out.println("The longest substring with at most 2 characters is of length : "
                + longestSubstringWith2RepeatingCharacters(string));
    }
}
