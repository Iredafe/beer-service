package dafe.springframework.beerservice.Grokking;

import dafe.springframework.beerservice.simuduck.Quack;

import java.util.LinkedList;
import java.util.Queue;

public class HitCounter {

    static Queue<Integer> hits;
    public HitCounter(){
        hits = new LinkedList<>();
    }

    public static void hit(int timestamp){
        hits.add(timestamp);
    }

    public static int getHits(int timestamp){


        return 1;
    }
}
