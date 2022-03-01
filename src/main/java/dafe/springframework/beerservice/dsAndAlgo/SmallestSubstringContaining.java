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
        while (left < right){
            char ch = bigString.charAt(right);
            if(reference.containsKey(ch)){
                if(reference.get(ch) == 1){
                    reference.remove(ch);
                }else{
                    reference.put(ch, reference.get(ch)-1);
                }
                    right++;

            }else{
                left++;
            }
            currentResult = bigString.substring(left,right);
            if(currentResult.length() < result.length()){
                result=currentResult;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String big = "abcd$ef$axb$c$";
        String small = "$$abf";

        System.out.println("This is the smallest substring : " + smallestSubstring(big, small));
    }
}
