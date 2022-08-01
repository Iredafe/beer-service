package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;

public class AreSentencesSimilar {

    private static boolean areSentencesSimilar(String [] sentence1, String [] sentence2, String [][] similarPairs){
        HashMap<String, String> map = new HashMap<>();
        if(sentence1.length!=sentence2.length) return false;
        for (String [] similarPair:  similarPairs){
                map.put(similarPair[0], similarPair[1]);
        }

        for(int i=0; i<sentence1.length; i++){
            String string1Key = sentence1[i];
            if(map.containsKey(string1Key)){
               String string1Value = map.get(string1Key);
               if(string1Value == sentence2[i]){
                   continue;
               }else{
                   return false;
               }
            } else if)(){

            }
        }


        return false;
    }

    public static void main(String[] args) {
       String [] sentence1 = {"great","acting","skills"};
        String [] sentence2 = {"fine","drama","talent"};
        String [][] similarPairs = {{"great","good"},{"fine","good"},{"drama","acting"},{"skills","talent"}};
    }
}
