package dafe.springframework.beerservice.Grokking;

import org.springframework.data.util.Pair;

import java.util.Deque;
import java.util.LinkedList;

public class HitCounter2 {

    static Deque<Pair<Integer, Integer>> timeFrequencyQueue;


    public HitCounter2(){
        timeFrequencyQueue = new LinkedList<>();
    }

    public static void hit(int timestamp){
        if (timeFrequencyQueue.isEmpty() || timeFrequencyQueue.getLast().getFirst() != timestamp){
            timeFrequencyQueue.offerLast(Pair.of(timestamp, 1));
        }else{
            int previousCount = timeFrequencyQueue.getFirst().getSecond();
            timeFrequencyQueue.removeLast();
            timeFrequencyQueue.add(Pair.of(timestamp, previousCount+1));
        }
    }
}
