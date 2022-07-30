package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentWords1 {
    private static List<String> topKFrequentWords(String [] wordArray, int k){

        HashMap<String , Integer> wordFrequencyMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(String word : wordArray){
            if(!wordFrequencyMap.containsKey(word)){
                wordFrequencyMap.put(word, 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String [] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k=3;
    }
}
