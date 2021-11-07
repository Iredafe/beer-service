package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static int firstNonRepeatingCharacter(String string){
        for(int index=0; index<string.length(); index++){
            boolean isDuplicate = false;
            for(int index2=0; index2<string.length(); index2++){
                if(string.charAt(index) == string.charAt(index2) && index != index2){
                    isDuplicate=true;
                }
            }
            if(!isDuplicate) return index;
        }

        return -1;
    }

    public static int firstNonRepeatingCharacterHashTable(String string){
        Map<Character, Integer> bucket = new HashMap<>();

        for(int i=0; i<string.length();i++){
            char stringLetter = string.charAt(i);
            bucket.put(stringLetter, bucket.getOrDefault(stringLetter, 0)+1);
        }
        System.out.println("bucket values : " + bucket);

        for (int i=0; i<string.length(); i++){
            char stringLetter = string.charAt(i);
            if(bucket.get(stringLetter)==1) return i;
        }

        return -1;
    }
    public static void main(String[] args) {

        String input="aadabcbbebdf";
        System.out.println("This is the index of first non- repeating character : " + firstNonRepeatingCharacter(input));
        System.out.println("This is the index of first non-repeating character : " + firstNonRepeatingCharacterHashTable(input));
    }
}
