package dafe.springframework.beerservice.Grokking;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
//not working as expected
public class LongestSubstringWithoutRepeatingCharacters {

    public static int longestSubstring(String input){
        int left=0; int right=0; int maxLength=0;
        Set<Character> slidingWindow = new HashSet<>();
        while(right < input.length()){
            char character = input.charAt(right);
            if(slidingWindow.contains(character)){
                slidingWindow.remove(input.charAt(left));
                left++;
            }else{
                slidingWindow.add(character);
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            }
        }
        return maxLength;
    }

    public static String longestSubstringWithoutRepeatingCharacters(String input){
        HashMap<Character, Integer> slidingWindow = new HashMap<>();
        int left=0; int right=0; int max =0;

        while(right<input.length()){

            if(!slidingWindow.containsKey(input.charAt(right))){
                slidingWindow.put(input.charAt(right), right);
                right++;
            }else {
                int smallestIndex = Collections.min(slidingWindow.values());
                slidingWindow.remove(input.charAt(smallestIndex));
                slidingWindow.put(input.charAt(right), right);
                left++;
                right++;
            }

        }
        return input.substring(left+1, right-left);
    }

    public static void main(String[] args) {
        String string = "clementisacap";
        System.out.println("This is the length of longest non-repeating substring : " + longestSubstring(string));
        System.out.println("This is the length of longest non-repeating substring : "
                + longestSubstringWithoutRepeatingCharacters(string));
    }
}
