package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.List;

public class LeaderBoard {

    class Entry{
        String from;
        String to;
        String message;

        public Entry(String from, String to, String message){
            this.from=from;
            this.to=to;
            this.message=message;
        }
    }

    private static List<String> leaderboard(List<Entry> entryList){
        HashMap<String, Integer> receiverFrequencyCount = new HashMap<>();

        for (Entry entry: entryList){
            receiverFrequencyCount.put(entry.to, receiverFrequencyCount.getOrDefault(entry.to, 0)+1);
        }

        return result;
    }


}
