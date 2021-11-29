package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplicates {

    public  static String longestSubstring(String input){
        //initialize an array of longest string
        //create a hashmap store for key-value information of all characters in the input
        //store the characters as key in the hashmap with their positions a value
        //loop through the store and check if the hashmap contains the current letter in the loop
        //if it is already contained in the store, update the longest string
        //update the hashmap with new position
        //return the substring of the newly found longest string

        int[] longest = {0,1};
        Map<Character, Integer> store = new HashMap<>();
        int startIndex = 0;
        for(int index = 0; index< input.length(); index++){
            char character = input.charAt(index);
            if(store.containsKey(character)){
                startIndex = Math.max(startIndex, store.get(character)+1);
            }
            if(longest[1] - longest[0] < (index+1) - startIndex){
                longest = new int[]{startIndex, index + 1};
            }
            store.put(character, index);
        }
        String result = input.substring(longest[0], longest[1]);

        return result;
    }


    public static void main(String[] args) {
        String string =  "clementisacap";

        System.out.println("The longest substring without duplicate is : " + longestSubstring(string));
    }
}
