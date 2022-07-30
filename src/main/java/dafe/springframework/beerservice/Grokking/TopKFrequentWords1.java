package dafe.springframework.beerservice.Grokking;

import java.util.*;

public class TopKFrequentWords1 {
    private static List<String> topKFrequentWords(String [] wordArray, int k){
        HashMap<String , Integer> wordFrequencyMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(String word : wordArray){
            if(!wordFrequencyMap.containsKey(word)){
                wordFrequencyMap.put(word, 1);
            }else{
                wordFrequencyMap.put(word,wordFrequencyMap.get(word)+1);
            }
        }

        PriorityQueue<Map.Entry<String,Integer>> heap = new PriorityQueue<>((a,b) -> a.getValue()==b.getValue()
                ? a.getKey().compareTo(b.getKey()) : a.getValue()-b.getValue());

        for(Map.Entry entry : wordFrequencyMap.entrySet()){
            heap.offer(entry);

            if(heap.size() > k){
                heap.poll();
            }
            while(!heap.isEmpty()){
                result.add(0,heap.poll().getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String [] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k=3;
        System.out.println("This is the top " + k + " frequent word -> " + topKFrequentWords(words,k));
    }
}
