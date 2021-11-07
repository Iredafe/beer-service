package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {

    public static boolean generateDoc(String characters, String document) {
    //initialize a hash map variable to store the elements in the available characters
        //loop through the characters and check if each letter in the document is contained therein
        //if all the letters in the document are found stored uniquely in the character store, then return true
        //else return false

        Map<Character, Integer> characterMap = new HashMap<>();

        for(int i=0; i<characters.length(); i++){
            char currentCharacter =characters.charAt(i);
            characterMap.put(currentCharacter, characterMap.getOrDefault(currentCharacter, 0)+1);

        }

        for (int i=0; i<document.length(); i++){
            char documentCurrentCharacter = document.charAt(i);
            if(!characterMap.containsKey(documentCurrentCharacter) || characterMap.get(documentCurrentCharacter)==0){
                return false;
            }
            characterMap.put(documentCurrentCharacter, characterMap.get(documentCurrentCharacter)-1);
        }
        return true;
    }


    public static void main(String[] args) {

        String input = "Bste!hetsi ogEAxpelrt ";
        String doc =  "AlgoExpert is the Best!";
        System.out.println(" The document can be generated : " + generateDoc(input, doc));
    }
}