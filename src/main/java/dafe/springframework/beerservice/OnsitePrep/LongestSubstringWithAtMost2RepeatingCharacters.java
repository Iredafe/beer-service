package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMost2RepeatingCharacters {


    private static String longestSubstringWith2RepeatingCharacters(String string) {

        int left = 0;
        int right = 0;
        int maxLength=0;
        Map<Character, Integer> map = new HashMap();
        return "";
    }

    public static void main(String[] args) {
        String string = "ccaabbb";
        System.out.println("The longest substring with at most 2 characters is of length : "
                + longestSubstringWith2RepeatingCharacters(string));
    }
}
