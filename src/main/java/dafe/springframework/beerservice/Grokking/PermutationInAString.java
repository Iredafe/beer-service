package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;

public class PermutationInAString {

    private static boolean findPermutation(String word, String pattern){

        HashMap<Character, Integer> characterFrequencymap = new HashMap<>();
        int left=0; int matched=0;

        for(char character : pattern.toCharArray()){
            characterFrequencymap.put(character, characterFrequencymap.getOrDefault(character, 0) +1);
        }

        for(int right=0; right< word.length(); right++){
            char character = word.charAt(right);
            if(characterFrequencymap.containsKey(character)){
                characterFrequencymap.put(character, characterFrequencymap.get(character)-1);
                if(characterFrequencymap.get(character)==0){
                    matched--;
                }
            }

            if(right >= pattern.length()-1){
                character = word.charAt(left);
                left++;
                if(characterFrequencymap.get(character) == 0){
                    matched--;
                    characterFrequencymap.put(character, characterFrequencymap.get(character)+1);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Permutation exist: "
                + findPermutation("oidbcaf", "abc"));
        System.out.println("Permutation exist: "
                + findPermutation("odicf", "dc"));
        System.out.println("Permutation exist: "
                + findPermutation("bcdxabcdy", "bcdyabcdx"));
        System.out.println("Permutation exist: "
                + findPermutation("aaacb", "abc"));
    }
}
