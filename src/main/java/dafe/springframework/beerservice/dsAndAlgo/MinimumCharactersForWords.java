package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumCharactersForWords {

    public static char[] minimumCharacterForWords(String [] words){

        ArrayList<Character> output = new ArrayList<>();
        HashMap<Character, Integer> bucket = new HashMap<>();
        for(String word : words){
            HashMap<Character, Integer> secondBucket = new HashMap<>();
            int frequency = 0;
            for(char character : word.toCharArray()){
                if(!secondBucket.isEmpty()){
                    if(secondBucket.containsKey(character) && secondBucket.get(character)!=frequency){
                        secondBucket.put(character, secondBucket.getOrDefault(character, 0) +1);
                        frequency++;
                        bucket.put(character, secondBucket.get(character));
                    }else{
                        secondBucket.put(character, 1);
                    }
                }
            }
        }
        for(Map.Entry <Character,Integer> frequency : bucket.entrySet()){
            char character = frequency.getKey();
            int characterFrequency = frequency.getValue();

            for(int i=0; i<characterFrequency; i++){
                output.add(character);
            }
        }

        char [] charactersArray = new char[output.size()];
        for(int idx = 0; idx< output.size(); idx++){
            charactersArray[idx] = output.get(idx);
        }

        return charactersArray;
    }

    public static void main(String [] args){

        String [] input = {"this", "that", "did", "deed", "them!", "a"};
        System.out.println("This is the minimum number of characters for words : " + Arrays.toString(minimumCharacterForWords(input)));

    }
}
