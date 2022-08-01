package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.HashSet;

public class AreSentencesSimilar {

    private static boolean areSentencesSimilar(String [] sentence1, String [] sentence2, String [][] similarPairs){
        HashMap<String, HashSet<String>> map = new HashMap<>();
        if(sentence1.length!=sentence2.length) return false;

        for(String [] similarPair : similarPairs){
            map.putIfAbsent(similarPair[0], new HashSet<>());
            map.putIfAbsent(similarPair[1], new HashSet<>());
            map.get(similarPair[0]).add(sentence1[1]);
            map.get(similarPair[1]).add(sentence1[0]);
        }




        return false;
    }

    public static void main(String[] args) {
       String [] sentence1 = {"great","acting","skills"};
        String [] sentence2 = {"fine","drama","talent"};
        String [][] similarPairs = {{"great","good"},{"fine","good"},{"drama","acting"},{"skills","talent"}};
    }
}
