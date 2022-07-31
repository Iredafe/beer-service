package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;

public class AreSentencesSimilar {

    private static boolean areSentencesSimilar(){
        HashMap<String, String> map = new HashMap<>();
        return false;
    }

    public static void main(String[] args) {
       String [] sentence1 = {"great","acting","skills"};
        String [] sentence2 = {"fine","drama","talent"};
        String [][] similarPairs = {{"great","good"},{"fine","good"},{"drama","acting"},{"skills","talent"}};
    }
}
