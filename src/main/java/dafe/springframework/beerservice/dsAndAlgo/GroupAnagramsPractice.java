package dafe.springframework.beerservice.dsAndAlgo;

import java.util.*;

public class GroupAnagramsPractice {
    public static List<List<String>> groupAnagrams(List<String> words){
    Map<String, List<String>> map = new HashMap<>();
    List<List<String>> groupAnagrams= new ArrayList<>();
    for(String word : words){
        char [] unsorted = word.toCharArray();
        Arrays.sort(unsorted);
        String sorted = new String(unsorted);
        if(!map.containsKey(sorted)){
            map.put(sorted, new ArrayList<>(Arrays.asList(word)));
        }else{
            map.get(sorted).add(word);
        }
    }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(new String[]{"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"});
        System.out.println("These are the group anagrams : " + groupAnagrams(words));
    }
}
