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
            System.out.println("This is the character map : " + characterMap);
        }

        for (int i=0; i<document.length(); i++){
            char documentCurrentCharacter = document.charAt(i);
            if(!characterMap.containsKey(documentCurrentCharacter) || characterMap.get(documentCurrentCharacter)==0){
                return false;
            }
            characterMap.put(documentCurrentCharacter, characterMap.get(documentCurrentCharacter)-1);
            System.out.println("This is the character map after second loop: " + characterMap);
        }
        return true;
    }

    public static boolean generateDocument(String characters, String document){
        for(int index=0; index< document.length(); index++){
            char character = document.charAt(index);
            int documentFrequency = countCharacterFrequency(character, document);
            int characterFrequency = countCharacterFrequency(character, characters);
            if(documentFrequency>characterFrequency){
                return false;
            }
        }

        return true;
    }

    private static int countCharacterFrequency(char character, String target) {
        int frequency = 0;
        for(int index=0; index< target.length(); index++){
            char c = target.charAt(index);
            if(c==character){
                frequency +=1;
            }
        }
return frequency;
    }

    //this solution is not working yet!! revisit
    public static boolean generateDocument1(String characters, String document){

        for(int characterIndex = 0; characterIndex< characters.length(); characterIndex++){
            for(int documentIndex = 0; documentIndex< characters.length(); documentIndex++){

                if(characters.charAt(characterIndex) != document.charAt(documentIndex) ){
                    documentIndex++;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {

        String input = "Bste!hetsi ogEAxpelrt x ";
        String doc =  "AlgoExpert is the Best!";
        System.out.println(" The document can be generated : " + generateDoc(input, doc));
        System.out.println(" The document can be generated : " + generateDocument(input, doc));
        System.out.println(" The document can be generated 1 : " + generateDocument1(input, doc));
    }
}