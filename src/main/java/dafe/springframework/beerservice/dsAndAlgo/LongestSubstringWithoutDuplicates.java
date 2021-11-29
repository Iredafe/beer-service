package dafe.springframework.beerservice.dsAndAlgo;

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


        return "";
    }


    public static void main(String[] args) {
        String string =  "clementisacap";

        System.out.println("The longest substring without duplicate is : " + longestSubstring(string));
    }
}
