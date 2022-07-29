package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentWords {

    private static String getTopKFrequentWords(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for(String word: words){
            if(!map.containsKey(word)){

            }
        }

        List<String> result = new ArrayList<>();

        return result;
    }

    public static void main(String[] args) {
        String [] words = {"i","love","leetcode","i","love","coding"}; int k=2;

        System.out.println("Top " + k + " frequent words are : " + getTopKFrequentWords(words, k));
    }
}
