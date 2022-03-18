package dafe.springframework.beerservice.dsAndAlgo;

import java.util.*;

public class LoggerRateLimiter {

    static class Pair<U,V>{
        U first;
        V second;

        public Pair(U first, V second){
            this.first = first;
            this.second = second;
        }

    }

    private static LinkedList<Pair<Integer, String >> msgQueue;
    private static Set<String> msgSet;
     public LoggerRateLimiter(){
         msgQueue = new LinkedList<>();
         msgSet = new HashSet<>();
    }


    public static boolean shouldPrintMessage2(int timestamp, String message){
         Map<String, Integer> map = new HashMap();

    }
    public static boolean shouldPrintMessage(int timestamp, String message){

         while(msgQueue.size() > 0){
             Pair<Integer, String> head = msgQueue.getFirst();

             if(timestamp - head.first >= 10){
                 msgQueue.removeFirst();
                 msgSet.remove(message);
             }else break;

             if(!msgSet.contains(message)){
                 Pair<Integer, String> newEntry = new Pair(timestamp, message);
                 msgQueue.addLast(newEntry);
                 msgSet.add(message);
                 return true;
             }else return false;
         }



         return false;
    }
}
