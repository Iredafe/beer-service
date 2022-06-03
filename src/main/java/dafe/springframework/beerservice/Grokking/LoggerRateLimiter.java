package dafe.springframework.beerservice.Grokking;

import org.springframework.data.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class LoggerRateLimiter {


    private static boolean shouldPrintMessage(Integer timestamp, String message){
        Queue<Pair<Integer, String>> messageQueue = new LinkedList<>();
        return false;
    }

    public static void main(String[] args) {

    }
}
