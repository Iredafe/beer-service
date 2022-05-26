package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;

public class MinimumWindowSubstring {

    private static String findSubstring(String string, String pattern){
        int matched=0; int windowStart=0;
        String result = "";

        HashMap<Character, Integer> characterFrequencyMap = new HashMap<>();

        for(char letter : pattern.toCharArray()){
            characterFrequencyMap.put(letter, characterFrequencyMap.getOrDefault(letter, 0) +1);
        }

        for(int windowEnd=0; windowEnd<string.length(); windowEnd++){
            char character = string.charAt(windowEnd);
            if(characterFrequencyMap.containsKey(character)){
                characterFrequencyMap.put(character, characterFrequencyMap.get(character)-1);
                if(characterFrequencyMap.get(character) == 0){
                    matched++;
                }
            }

            if(matched==pattern.length()){
                result = string.substring(windowStart, windowEnd+1);
            }

            if(windowEnd >= pattern.length()-1){
                character = string.charAt(windowStart++);
                if(characterFrequencyMap.containsKey(character)){

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSubstring("aabdec", "abc"));
        System.out.println(findSubstring("aabdec", "abac"));
        System.out.println(findSubstring("abdbca", "abc"));
        System.out.println(findSubstring("adcad", "abc"));
    }
}
