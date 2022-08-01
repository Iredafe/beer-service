package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.HashSet;

public class AreSentencesSimilar {

    private static boolean areSentencesSimilar(String [] sentence1, String [] sentence2, String [][] similarPairs){
        HashMap<String, HashSet<String>> map = new HashMap<>();
        if(sentence1.length!=sentence2.length) return false;

        for(String [] similarPair : similarPairs){
            map.putIfAbsent(sentence1[0], new HashSet<>());
            map.putIfAbsent(sentence1[1], new HashSet<>());
        }




        return false;
    }

    public static void main(String[] args) {
       String [] sentence1 = {"great","acting","skills"};
        String [] sentence2 = {"fine","drama","talent"};
        String [][] similarPairs = {{"great","good"},{"fine","good"},{"drama","acting"},{"skills","talent"}};
    }
}
