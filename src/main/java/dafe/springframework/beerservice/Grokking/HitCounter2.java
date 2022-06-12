package dafe.springframework.beerservice.Grokking;

import org.springframework.data.util.Pair;

import java.util.Deque;
import java.util.HashMap;

public class HitCounter2 {

    static Deque<Pair<Integer, Integer>> timeFrequencyMap;


    public HitCounter2(){
        timeFrequencyMap = new HashMap<>();
    }

    public static void hit(int timestamp){

    }
}
