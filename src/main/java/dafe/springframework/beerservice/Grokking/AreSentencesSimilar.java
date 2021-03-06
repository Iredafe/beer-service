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
            map.get(similarPair[0]).add(similarPair[1]);
            map.get(similarPair[1]).add(similarPair[0]);
        }

        for(int i=0; i< sentence1.length; i++){
            if(sentence1[i].equals(sentence2[i])) continue;
            if(!map.containsKey(sentence1[i])) return false;
            if(!map.get(sentence1[i]).contains(sentence2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
       String [] sentence1 = {"great","acting","skills"};
        String [] sentence2 = {"fine","drama","talent"};
        String [][] similarPairs = {{"great","fine"},{"drama","acting"},{"skills","talent"}};


        System.out.println("These sentences are similar " + areSentencesSimilar(sentence1, sentence2, similarPairs));
    }
}
