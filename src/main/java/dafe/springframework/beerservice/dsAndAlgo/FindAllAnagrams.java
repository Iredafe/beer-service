package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result =  new ArrayList<>();
        return result;
    }


    public static void main(String[] args) {

        String s = "cbaebabacd", p = "abc";
        System.out.println("This is position of all the anagrams : " + findAnagrams(s,p));
    }
}
