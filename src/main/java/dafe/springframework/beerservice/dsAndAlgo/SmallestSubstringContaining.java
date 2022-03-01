package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubstringContaining {

    public static String smallestSubstring(String bigString, String smallString){
        String result = "";
        Map<Character, Integer> reference = new HashMap();
        Map<Character, Integer> window = new HashMap<>();
        String currentResult = "";
        for(char ch : smallString.toCharArray()){
          reference.put(ch, 1);
        }

        for(int i=0)
        return result;
    }

    public static void main(String[] args) {
        String big = "abcd$ef$axb$c$";
        String small = "$$abf";
    }
}
