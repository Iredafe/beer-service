package dafe.springframework.beerservice.Grokking;

import dafe.springframework.beerservice.simuduck.Quack;

import java.util.LinkedList;
import java.util.Queue;

public class HitCounter {

    Queue<Integer> hits;
    public HitCounter(){
        hits = new LinkedList<>();
    }
}
