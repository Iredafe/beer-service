package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInString {

    private static List<Integer> findStringAnagrams(String string, String pattern){
        List<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> characterFreqMap = new HashMap<>();
        int matched=0; int windowStart=0;
        for(char character : pattern.toCharArray()){
            characterFreqMap.put(character, characterFreqMap.getOrDefault(character,0)+1);
        }

        for(int windowEnd=0; windowEnd<string.length(); windowEnd++){
            char character = string.charAt(windowEnd);
            if(characterFreqMap.containsKey(character)){
                characterFreqMap.put(character, characterFreqMap.get(character)-1);
                if(characterFreqMap.get(character)==0){
                    matched++;
                }
            }

            if(matched == characterFreqMap.size()) result.add(windowStart);

            if(windowEnd >= pattern.length()-1){
                character = string.charAt(windowStart++);
                if(characterFreqMap.containsKey(character)){
                    if(characterFreqMap.get(character)==0){
                        matched--;
                    }
                    characterFreqMap.put(character, characterFreqMap.get(character)+1);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(findStringAnagrams("ppqp", "pq"));
        System.out.println(findStringAnagrams("abbcabc", "abc"));
    }
}
