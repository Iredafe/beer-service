package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {


    public static void main(String[] args) {
        String s = "anagram"; String t = "nagaram";

        System.out.println("This is a valid anagram : " + validAnagram(s,t));
    }

    private static boolean validAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) -1);

        }
        for(char letter : map.keySet()){
            if(map.get(letter) != 0 ) return false;
        }
        return true;
    }
}
