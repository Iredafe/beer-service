package dafe.springframework.beerservice.Gym;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithSameLettersAfterReplacement {

    private static int findLength(String string, int k){
        int maxLength=0; int maxRepeatingLetterCount=0; int left=0;
        Map<Character, Integer> letterFrequencyMap = new HashMap<>();

        for(int right=0; right<string.length(); right++){
            char character = string.charAt(right);

            letterFrequencyMap.put(character, letterFrequencyMap.getOrDefault(character,0)+1);
            maxRepeatingLetterCount=Math.max(maxRepeatingLetterCount, letterFrequencyMap.get(character));

            if(right-left+1-maxRepeatingLetterCount > k){
                character = string.charAt(left);
                letterFrequencyMap.put(character, letterFrequencyMap.get(character)-1);
                left++;

                }
            maxLength = Math.max(maxLength, right-left+1);

        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(findLength("aabccbb", 2));
        System.out.println(findLength("abbcb", 1));
        System.out.println(findLength("abccde", 1));
    }
}
