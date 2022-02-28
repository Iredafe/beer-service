package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {

        Map<Character, Integer> pCount = new HashMap();
        Map<Character, Integer> sCount = new HashMap();
//build reference map
        for(char ch : p.toCharArray()){
            if(pCount.containsKey(ch)){
                pCount.put(ch, pCount.get(ch) + 1);
            }else{
                pCount.put(ch, 1);
            }
        }
//build window
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(sCount.containsKey(c)){
                sCount.put(c, sCount.get(c)+1);
            }else{
                sCount.put(c, 1);
            }

            if(i >= p.length()){
                char ch = s.charAt(i-p.length());
                if(sCount.get(ch) == 1){
                    sCount.remove(ch);
                }else{
                    sCount.put(ch, sCount.get(ch)-1);
                }
            }
        }
        List<Integer> result =  new ArrayList<>();
        return result;
    }


    public static void main(String[] args) {

        String s = "cbaebabacd", p = "abc";
        System.out.println("This is position of all the anagrams : " + findAnagrams(s,p));
    }
}
