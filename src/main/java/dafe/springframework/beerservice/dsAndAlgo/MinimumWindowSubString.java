package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString {

    public static String minWindowSubstring(String bigString, String smallString){

        Map<Character, Integer> map = new HashMap();
        Map<Character, Integer> windowCounts = new HashMap();

        for(int i=0; i<smallString.length(); i++){
            char ch = smallString.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch, 0);
            }
        }

        int required = map.size();
    }

    public static void main(String[] args) {
        String big = "abcd$ef$axb$c$";
        String small = "$$abf";

        System.out.println("This is the smallest substring : " + minWindowSubstring(big, small));
    }
}
