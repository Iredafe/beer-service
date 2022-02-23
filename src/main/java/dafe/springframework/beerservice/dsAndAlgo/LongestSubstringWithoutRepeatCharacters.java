package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatCharacters {

    public static void main(String[] args) {
        String input = " abccabcabcc";
        System.out.println("The longest substring is : " + longest(input));
    }

    private static int longest(String input) {

        Set<Character> window = new HashSet<>();
        int left = 0; int right = input.length()-1;
        int result = 0;
            while (left<right){
                if(!window.contains(right)){
                    window.add(input.charAt(right));
                    right++;
                    result++;
                }else{
                    window.remove(input.charAt(right));
                    left++;
                }

                return Math.max(result, right-left);

            }

        return result;
    }
}
