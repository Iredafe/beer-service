package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {

        Map<Character, Integer> pCount = new HashMap();
        Map<Character, Integer> sCount = new HashMap();

        for(char ch : p.toCharArray()){
            if(pCount.containsKey(ch)){
                pCount.put(ch, pCount.get(ch) + 1);
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
