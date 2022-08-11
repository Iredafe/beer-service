package dafe.springframework.beerservice.Grokking;

import java.util.*;

public class LeaderBoard {

    static class Entry{
        String from;
        String to;
        String message;

        public Entry(String from, String to, String message){
            this.from=from;
            this.to=to;
            this.message=message;
        }
    }

    private static List<String> leaderboard(List<Entry> entryList){
        HashMap<String, Integer> receiverFrequencyCount = new HashMap<>();
        List<String> result=new ArrayList<>();

        for (Entry entry: entryList){
            receiverFrequencyCount.put(entry.to, receiverFrequencyCount.getOrDefault(entry.to, 0)+1);
        }

        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>((a, b)->b.getValue()- a.getValue());
        PriorityQueue<Map.Entry<String, Integer>> heap1 = new PriorityQueue<>((a, b)-> Integer.compare(b.getValue(), a.getValue()));

        for(Map.Entry<String,Integer> entry : receiverFrequencyCount.entrySet()){
            heap.add(entry);
        }

        for(int i=0; i<heap.size(); i++ ){
            result.add(heap.poll().getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Entry> list = Arrays.asList(
                new Entry("go", "pre", "hate"),
                new Entry("dee","Elo", "come"),
                new Entry("dee","Elo", "come"),
                new Entry("dee","Elo", "come"),
                new Entry("dee","pre", "come"),
                new Entry("dee","dafe", "come"),
                new Entry("dafe", "pre", "love")
        );
    }
}
