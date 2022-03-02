package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {
    public static List<Integer> findAnagrams(String original, String check) {

        List<Integer> result =  new ArrayList<>();
        Map<Character, Integer> reference = new HashMap();
        Map<Character, Integer> window = new HashMap();
//build reference map
        for(char ch : check.toCharArray()){
            if(reference.containsKey(ch)){
                reference.put(ch, reference.get(ch) + 1);
            }else{
                reference.put(ch, 1);
            }
        }
//build window
        for(int i=0; i<original.length(); i++){
            char c = original.charAt(i);
            if(window.containsKey(c)){
                window.put(c, window.get(c)+1);
            }else{
                window.put(c, 1);
            }
            if(i >= check.length()) {
                c = original.charAt(i - check.length());
                if (window.get(c) == 1) {
                    window.remove(c);
                } else {
                    window.put(c, window.get(c) - 1);
                }
            }
                if(window.equals(reference)){
                    result.add(i-check.length() +1);
                }
            }
        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println("This is position of all the anagrams : " + findAnagrams(s,p));
    }
}
