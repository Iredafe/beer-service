package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatCharacters {

    public static void main(String[] args) {
        String input = "abccabcabcc";
        System.out.println("The longest substring is : " + longest(input));
    }

    private static int longest(String input) {
        Set<Character> window = new HashSet<>();
        int left = 0; int right = 0;
        int result = 0;
            while (right<input.length()){
                if(!window.contains(input.charAt(right))){
                    window.add(input.charAt(right));
                    right++;
                }else{
                    window.remove(input.charAt(left));
                    left++;
                }
                result =  Math.max(result, right-left);
            }

        return result;
    }
}
