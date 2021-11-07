package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
//
//    public static int firstNonRepeatingCharacter(String string){
//
//        char [] arr = string.toCharArray();
//        boolean isDuplicate = true;
//        for(int index=0; index<arr.length; index++){
//            for(int index2=arr.length-1; index2>0; index2--){
//                if(arr[index] != arr[index2] && index != index2){
//                    index2--;
//                    isDuplicate= false;
//                }
//                index++;
//            }
//
//            if(isDuplicate==true) return index;
//        }
//
//        return -1;
//    }

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
       // System.out.println("This is the index of first non- repeating character : " + firstNonRepeatingCharacter(input));
        System.out.println("This is the index of first non-repeating character : " + firstNonRepeatingCharacterHashTable(input));
    }
}
