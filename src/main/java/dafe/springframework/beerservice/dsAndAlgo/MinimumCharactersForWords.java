package dafe.springframework.beerservice.dsAndAlgo;

import javax.persistence.criteria.CriteriaBuilder;
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
                    }
                }else{
                    secondBucket.put(character, 1);
                    bucket.put(character, secondBucket.get(character));
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

    public static char[] minimumCharacterNeededForWords(String [] words){

        HashMap<Character, Integer> maximumCharacterFrequencies = new HashMap<>();

        for(String word : words){
            HashMap<Character, Integer> characterFrequencies = countCharacterFrequencies(word);
            updateMaximumFrequencies(characterFrequencies, maximumCharacterFrequencies);
        }
        return makeArrayFromCharacterFrequencies(maximumCharacterFrequencies);
        }

    public static HashMap<Character, Integer> countCharacterFrequencies(String word) {
            HashMap<Character, Integer> characterFrequency = new HashMap<>();

            return characterFrequency;
    }

    public static void updateMaximumFrequencies(HashMap<Character, Integer> characterFrequencies,
                                                                       HashMap<Character, Integer> maximumCharacterFrequencies){

    }

    public static char[] makeArrayFromCharacterFrequencies(HashMap<Character, Integer> characterFrequency){

        return new char[]{};
    }
    public static void main(String [] args){

        String [] input = {"this", "that", "did", "deed", "them!", "a"};
        System.out.println("This is the minimum number of characters for words : " + Arrays.toString(minimumCharacterForWords(input)));

    }
}
