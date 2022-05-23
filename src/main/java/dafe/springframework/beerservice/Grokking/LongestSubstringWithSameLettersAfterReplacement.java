package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithSameLettersAfterReplacement {

    private static int findLength(String string){
        int maxLength=0; int maxRepeatingLetterCount=0; int left=0;
        Map<Character, Integer> letterFrequencyMap = new HashMap<>();
    }

    public static void main(String[] args) {
        System.out.println(findLength("aabccbb", 2));
        System.out.println(findLength("abbcb", 1));
        System.out.println(findLength("abccde", 1));
    }
}
