package dafe.springframework.beerservice.Gym;

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
    static HashMap<String, Integer> messageDictionary = new HashMap<>();
    private static boolean shouldPrint(String message, Integer timestamp){

        if(!messageDictionary.containsKey(message)){
            messageDictionary.put(message, timestamp);
            return true;
        }
        int oldTimeStamp = messageDictionary.get(message);
        if(timestamp-oldTimeStamp>=10){
            messageDictionary.put(message, timestamp);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Map<Integer, String> streamMap= new HashMap<>();
            streamMap.put(1,"foo");
            streamMap.put(2,"bar");
            streamMap.put(3,"foo");
            streamMap.put(8,"bar");
            streamMap.put(10,"foo");
            streamMap.put(11,"foo");

            for(Map.Entry<Integer, String> entry : streamMap.entrySet()){
//                System.out.println("1. We can print {timestamp-- " +
//                        entry.getKey()+ ": message-- "+ entry.getValue()+ "} ->" +
//                        shouldPrintMessage(entry.getKey(), entry.getValue()));

                System.out.println("2. We can print {timestamp-- " +
                        entry.getKey()+ ": message-- "+ entry.getValue()+ "} ->" +
                        shouldPrint(entry.getValue(), entry.getKey()));
            }

    }
}
