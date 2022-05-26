package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;

public class MinimumWindowSubstring {

    private static String findSubstring(String string, String pattern){
        int matched=0; int windowStart=0; int minLength =string.length()+1;
        int  substringStart=0;

        HashMap<Character, Integer> characterFrequencyMap = new HashMap<>();

        if(string.equals(pattern)) return string;
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

            while (matched==pattern.length()){
                if(minLength> windowEnd-windowStart+1){
                    minLength=windowEnd-windowStart+1;
                    substringStart = windowStart;

            }


                character = string.charAt(windowStart++);
                if(characterFrequencyMap.containsKey(character)) {
                    if (characterFrequencyMap.get(character) >= 0) {
                        matched--;
                    }
                    characterFrequencyMap.put(character, characterFrequencyMap.get(character) + 1);
                }
            }
        }
        return minLength > string.length() ? "" : string.substring(substringStart, substringStart+minLength);
    }

    public static void main(String[] args) {
        System.out.println("This is the result 1 " + findSubstring("bbaa", "aba"));
//        System.out.println("This is the result 2 " +findSubstring("aabdec", "abac"));
//        System.out.println("This is the result 3 " +findSubstring("abdbca", "abc"));
//        System.out.println("This is the result 4 " +findSubstring("adcad", "abc"));
    }
}
