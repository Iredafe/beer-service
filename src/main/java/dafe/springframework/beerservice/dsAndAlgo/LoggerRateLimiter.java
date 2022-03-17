package dafe.springframework.beerservice.dsAndAlgo;

import org.springframework.data.util.Pair;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LoggerRateLimiter {

    private LinkedList<Pair<Integer, String >> msgQueue;
    private Set<String> msgSet;
     public LoggerRateLimiter(){
         msgQueue = new LinkedList<>();
         msgSet = new HashSet<>();
    }
}
