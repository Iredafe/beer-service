package dafe.springframework.beerservice.dsAndAlgo;

import org.springframework.data.util.Pair;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LoggerRateLimiter {

    private static LinkedList<Pair<Integer, String >> msgQueue;
    private static Set<String> msgSet;
     public LoggerRateLimiter(){
         msgQueue = new LinkedList<>();
         msgSet = new HashSet<>();
    }


    public static boolean shouldPrintMessage(int timestamp, String message){

         while(msgQueue.size() > 0){
             Pair<Integer, String> head = msgQueue.getFirst();

             if(timestamp - head.getFirst() >= 10){
                 msgQueue.removeFirst();
                 msgSet.remove(message);
             }else break;

             if(!msgSet.contains(message)){
                 Pair<Integer, String> newEntry = new Pair(timestamp, message);
                 msgQueue.addLast();
             }
         }



         return false;
    }
}
