package dafe.springframework.beerservice.Grokking;

import org.springframework.data.util.Pair;

import java.util.Deque;
import java.util.LinkedList;

public class HitCounter2 {

    static Deque<Pair<Integer, Integer>> timeFrequencyQueue;
    static int total;

    public HitCounter2(){
        timeFrequencyQueue = new LinkedList<>();
        total=0;
    }

    public static void hit(int timestamp){
        if (timeFrequencyQueue.isEmpty() || timeFrequencyQueue.getLast().getFirst() != timestamp){
            timeFrequencyQueue.offerLast(Pair.of(timestamp, 1));
        }else{
            int previousCount = timeFrequencyQueue.getFirst().getSecond();
            timeFrequencyQueue.removeLast();
            timeFrequencyQueue.add(Pair.of(timestamp, previousCount+1));
        }
        total++;
    }

    public static int getHits(int timestamp){
        while(!timeFrequencyQueue.isEmpty()){
            int diff = timestamp - timeFrequencyQueue.getFirst().getFirst() ;
            if(diff >=300){
                total -= timeFrequencyQueue.peekFirst().getSecond();
                timeFrequencyQueue.removeFirst();
            } else break;
        }
        return total;
    }

    public static void main(String[] args) {

        HitCounter2 hitCounter = new HitCounter2();
        hitCounter.hit(1);
        System.out.println("total hit at timestamp 1 : " + hitCounter.total);
        hitCounter.hit(2);
        System.out.println("total hit at timestamp 2 : " + hitCounter.total);
        hitCounter.hit(3);
        System.out.println("total hit at timestamp 3 : " + hitCounter.total);
        hitCounter.getHits(4);
        System.out.println("total hit at timestamp 4 : " + hitCounter.total);
        hitCounter.hit(300);
        System.out.println("total hit at timestamp 300 : " + hitCounter.total);
        hitCounter.getHits(300);
        System.out.println("total hit at timestamp 300 : " + hitCounter.total);
        hitCounter.getHits(301);
        System.out.println("total hit at timestamp 301 : " + hitCounter.total);
    }
}
