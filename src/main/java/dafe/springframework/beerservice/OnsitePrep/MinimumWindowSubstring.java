package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashMap;

public class MinimumWindowSubstring {

    private static String findMinimumWindowSubstring(String longString, String shortString) {
        if(longString.length()==0 || shortString.length()==0) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<shortString.length(); i++){
            char character = shortString.charAt(i);
            int count = map.getOrDefault(character, 0);
            map.put(character, count+1);
        }

        HashMap<Character, Integer> slidingWindowMap = new HashMap<>();
        return "";
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("This is the minimum window : " + findMinimumWindowSubstring(s, t));
    }
}
