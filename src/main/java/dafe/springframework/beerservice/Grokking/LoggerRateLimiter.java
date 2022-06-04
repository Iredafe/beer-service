package dafe.springframework.beerservice.Grokking;

import org.springframework.data.util.Pair;

import java.util.*;

public class LoggerRateLimiter {
    static Deque<Pair<Integer, String>> messageQueue = new LinkedList<>();
    static Set<String> messageIndex = new HashSet<>();

    private static boolean shouldPrintMessage(Integer timestamp, String message){
        while(messageQueue.size()>0){
            Pair<Integer, String> streamEntry = messageQueue.getFirst();
         //clean up
            if(timestamp - streamEntry.getFirst()>=10){
                messageQueue.remove();
                messageIndex.remove(streamEntry.getSecond());
            }else break;
        }
        if(!messageIndex.contains(message)){
            Pair<Integer, String> newEntry = Pair.of(timestamp, message);
            messageIndex.add(message);
            messageQueue.add(newEntry);
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> streamMap= new HashMap<>();
            streamMap.put(1,"foo");
            streamMap.put(2,"bar");
            streamMap.put(3,"foo");
            streamMap.put(8,"bar");
            streamMap.put(10,"foo");
            streamMap.put(11,"foo");

            for(Map.Entry<Integer, String> entry : streamMap.entrySet()){
                System.out.println("We can print {timestamp-- " +
                        entry.getKey()+ ": message-- "+ entry.getValue()+ "} ->" +
                        shouldPrintMessage(entry.getKey(), entry.getValue()));
            }

    }
}
