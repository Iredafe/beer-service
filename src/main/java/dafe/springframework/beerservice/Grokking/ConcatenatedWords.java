package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConcatenatedWords {

    private static List<Integer> findWordConcatenation(String string, String [] words){
        List<Integer> resultIndices = new ArrayList<>();
        int wordCount = words.length;
        int wordLength = words[0].length();
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        for(String word : words){
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0)+1);
        }

        for(int i=0; i<string.length() - wordCount*wordLength; i++){
            HashMap<String, Integer> wordsSeen = new HashMap<>();
            for(int j=0; j<wordCount; j++){
                int nextWordIndex = i+j * wordCount;

                String word = string.substring(nextWordIndex, nextWordIndex+wordCount);

                if(!wordFrequencyMap.containsKey(word)){
                    break;
                }
            }
        }



        return resultIndices;
    }
    public static void main(String[] args) {
        List<Integer> result = findWordConcatenation(
                "catfoxcat", new String[] { "cat", "fox" });
        System.out.println(result);
        result = findWordConcatenation(
                "catcatfoxfox", new String[] { "cat", "fox" });
        System.out.println(result);
    }
}