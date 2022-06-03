package dafe.springframework.beerservice.Grokking;

import org.springframework.data.util.Pair;

import java.util.*;

public class LoggerRateLimiter {


    private static boolean shouldPrintMessage(Integer timestamp, String message){
        Queue<Pair<Integer, String>> messageQueue = new LinkedList<>();
        Set<String> messageIndex = new HashSet<>();

        while(messageQueue.size()>0){
            Pair<Integer, String> streamEntry = messageQueue.poll();
         //clean up
            if(timestamp - streamEntry.getFirst()>=10){
                messageQueue.remove();
                messageIndex.remove(streamEntry.getSecond());
            }else break;

            if(!messageIndex.contains(message)){
                Pair<Integer, String> newEntry = Pair.of(timestamp, message);
                messageIndex.add(message);
                messageQueue.add(newEntry);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {


    }
}
