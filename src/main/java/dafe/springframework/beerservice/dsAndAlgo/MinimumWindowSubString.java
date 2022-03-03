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
        int [] ans = {-1, 0,0};
        int left = 0; int right =0;
        while (right < bigString.length()){
            char c = bigString.charAt(right);
        if(windowCounts.containsKey(c)){
            map.put(c, map.get(c)+1);
        }
        }
        return "";
    }

    public static void main(String[] args) {
        String big = "abcd$ef$axb$c$";
        String small = "$$abf";

        System.out.println("This is the smallest substring : " + minWindowSubstring(big, small));
    }
}
