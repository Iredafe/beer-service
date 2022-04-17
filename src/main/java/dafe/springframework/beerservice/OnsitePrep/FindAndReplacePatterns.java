package dafe.springframework.beerservice.OnsitePrep;

import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePatterns {

    public static List<String> findAndReplace(String words, String pattern){
        List<String> result = new ArrayList<>();

        for(String word : words){
            if(matchPatternWithWord(word, pattern)){
                result.add(word);
            }
            return result;
        }

        return result;
    }

    public static void main(String[] args) {
        String words []=new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        System.out.println("These are the words that match the pattern : " + findAndReplace(words, pattern));

    }
}
