package dafe.springframework.beerservice.OP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePatterns {

    public static List<String> findAndReplace(String [] words, String pattern){
        List<String> result = new ArrayList<>();

        for(String word : words) {
            if (matchPatternWithWord(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }

    public static boolean matchPatternWithWord(String word, String pattern){
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0; i< word.length(); i++){
            char characterInWord = word.charAt(i);
            char characterInPattern = pattern.charAt(i);
            if(!map1.containsKey(characterInWord)){
                map1.put(characterInWord, characterInPattern);
            }
            if(!map2.containsKey(characterInPattern)){
                map2.put(characterInPattern, characterInWord);
            }
            if(map1.get(characterInWord) != characterInPattern || map2.get(characterInPattern) != characterInWord)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String words []=new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        System.out.println("These are the words that match the pattern : " + findAndReplace(words, pattern));

    }
}
