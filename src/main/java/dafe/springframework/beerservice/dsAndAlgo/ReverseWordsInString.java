package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {
    public static String reverseWordsInString(String string) {
     List<String> results = new ArrayList<>();
     int startOfWord = 0;
     for(int index = 0; index<string.length(); index++){
        char character = string.charAt(index);
         if(character == ' '){
             String charactersToAdd = string.substring(startOfWord, index);
             results.add(charactersToAdd);
             startOfWord=index;
         }else if(string.charAt(startOfWord) == ' '){
             results.add(" ");
             startOfWord=index;
         }
     }
     //add the last word to the list because if there is no space after the last word, it would not be added to the string
     results.add(string.substring(startOfWord));
     Collections.reverse(results);
     return String.join("", results);
    }

    public static void main(String[] args) {
        String input =  "4 wh";
        System.out.println("This is the reversed string : " + reverseWordsInString(input));
    }
}
