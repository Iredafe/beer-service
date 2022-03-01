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
            if (reference.containsKey(ch)) {
                reference.put(ch, reference.get(ch) +1);
            }else{
                reference.put(ch, 1);
            }
        }
        int left = 0; int right = 0;
        for(int i=0; i<bigString.length(); i++){
            char ch = bigString.charAt(i);
            if(!reference.containsKey(ch)){
                if(reference.get(ch)==1){
                    left++;
                }
            }else{
                reference.put(ch, reference.get(ch) -1);
                right++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String big = "abcd$ef$axb$c$";
        String small = "$$abf";
    }
}
