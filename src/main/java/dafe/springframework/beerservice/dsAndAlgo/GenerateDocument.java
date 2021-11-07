package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {

    public static boolean generateDoc(String characters, String document) {
    //initialize a variable to store the elements in the available characters
        //loop through the characters and check if each letter in the document is contained therein
        //if all the letters in the document are found stored uniquely in the character store, then return true
        //else return false

        Map<Integer, String> characterMap = new HashMap<>();
        for(int i=0; i<characters.length(); i++){
            characterMap.put(i,characters);

        }
        return false;
    }


    public static void main(String[] args) {

        String input = "Bste!hetsi ogEAxpelrt x ";
        String doc =  "AlgoExpert is the Best!";
        System.out.println(" The document can be generated : " + generateDoc(input, doc));
    }
}