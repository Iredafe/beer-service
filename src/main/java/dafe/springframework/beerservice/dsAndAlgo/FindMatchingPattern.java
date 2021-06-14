package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMatchingPattern {

    public static List<String> findAndReplacePattern(String [] words, String pattern){
        List <String> answer = new ArrayList<>();
        for(String word : words)
            if(match(word,pattern))
            answer.add(word);
        return answer;
    }

    public static boolean match(String word, String pattern){
        Map <Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for(int i=0; i< word.length(); ++i){
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if(!map1.containsKey(w)) map1.put(w,p);
            if(!map2.containsKey(p)) map2.put(p,w);
            if(map1.get(w) != p|| map2.get(p) != w) return false;
        }
        return true;
    }


    public static void main(String[] args) {

        String [] inputArray = {"abc","deq","mee","aqq","dkd","ccc"};
        String inputString = "abb";

        System.out.println("This is the answer : " + findAndReplacePattern(inputArray, inputString));
    }


}
