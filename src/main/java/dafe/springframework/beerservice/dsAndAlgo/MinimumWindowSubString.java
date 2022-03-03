package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString {

    public static String minWindowSubstring(String bigString, String smallString){

        Map<Character, Integer> map = new HashMap();
        Map<Character, Integer> windowCounts = new HashMap();

    }

    public static void main(String[] args) {
        String big = "abcd$ef$axb$c$";
        String small = "$$abf";

        System.out.println("This is the smallest substring : " + minWindowSubstring(big, small));
    }
}
