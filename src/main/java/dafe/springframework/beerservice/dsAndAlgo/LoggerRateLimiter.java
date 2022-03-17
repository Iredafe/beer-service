package dafe.springframework.beerservice.dsAndAlgo;

import org.springframework.data.util.Pair;

import java.util.LinkedList;

public class LoggerRateLimiter {

    private LinkedList<Pair<Integer, String >> msgQueue;
     public LoggerRateLimiter(){
         msgQueue = new LinkedList<>();
    }
}
