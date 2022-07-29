package dafe.springframework.beerservice.Grokking;

import java.util.*;

public class TopKFrequentWords {

    private static List<String> getTopKFrequentWords(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(!map.containsKey(word)){
                map.put(word, 1);
            }else {
                map.put(word, map.get(word)+1);
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(
                (a,b)->a.getValue() ==
                b.getValue() ? b.getKey().compareTo(a.getKey()) :
                        a.getValue() - b.getValue());

        for(Map.Entry<String, Integer> entry : map.entrySet()){

        }
        List<String> result = new ArrayList<>();

        return result;
    }

    public static void main(String[] args) {
        String [] words = {"i","love","leetcode","i","love","coding"}; int k=2;

        System.out.println("Top " + k + " frequent words are : " + getTopKFrequentWords(words, k));
    }
}
