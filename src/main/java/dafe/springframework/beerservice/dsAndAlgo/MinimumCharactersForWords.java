package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumCharactersForWords {

    public static char[] minimumCharacterForWords(String [] words){

        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Character, Integer> bucket = new HashMap<>();
        for(String word : words){
            HashMap<Character, Integer> secondBucket = new HashMap<>();
            int frequency = 0;
            for(char character : word.toCharArray()){
                if(!secondBucket.isEmpty()){
                    if(secondBucket.containsKey(character) && secondBucket.get(character)!=frequency){
                        secondBucket.put(character, secondBucket.getOrDefault(character, 0) +1);
                        bucket.put(character, secondBucket.get(character));
                    }
                }
            }
        }


        return new char[]{};
    }

    public static void main(String [] args){

        String [] input = {"this", "that", "did", "deed", "them!", "a"};
        System.out.println("This is the minimum number of characters for words : ");

    }
}
