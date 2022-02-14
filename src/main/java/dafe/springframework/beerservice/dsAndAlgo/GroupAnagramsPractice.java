package dafe.springframework.beerservice.dsAndAlgo;

import java.util.*;

public class GroupAnagramsPractice {
    public static List<List<String>> groupAnagrams(List<String> words){
    Map<String, List<List<String>>> map = new HashMap<>();
    List<List<String>> groupAnagrams= new ArrayList<>();
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(new String[]{"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"});
        System.out.println("These are the group anagrams : " + groupAnagrams(words));
    }
}
