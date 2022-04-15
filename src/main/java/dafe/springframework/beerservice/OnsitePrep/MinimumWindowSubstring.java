package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashMap;

public class MinimumWindowSubstring {

    private static String findMinimumWindowSubstring(String longString, String shortString) {
        if(longString.length()==0 || shortString.length()==0) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<shortString.length(); i++){
            char character = shortString.charAt(i);
            int count = map.getOrDefault(character, 0);
            map.put(character, count+1);
        }

        int requiredSize = map.size();
        HashMap<Character, Integer> slidingWindowMap = new HashMap<>();
        int left=0; int right=0; int formed = 0;
        int answer[] = {-1, 0, 0};
        while(right< longString.length()){
            char character = longString.charAt(right);
            for(int i=0; i<longString.length(); i++){
                int count = slidingWindowMap.getOrDefault(character, 0);
                slidingWindowMap.put(character, count);

                if(map.get(character).equals(slidingWindowMap.get(character))){
                    formed++;
                }

                while(left<right && formed == requiredSize){
                   if(answer[0] == -1 || (right-left+1) < answer[0]){
                       answer[0] = right-left+1;
                       answer[1] = left;
                       answer[2] = right;
                   }
                   char leftCharacter = longString.charAt(left);
                   while(slidingWindowMap.get(leftCharacter).intValue() < map.get(leftCharacter)){
                       formed--;
                   }
                   left++;
                }
                right++;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("This is the minimum window : " + findMinimumWindowSubstring(s, t));
    }
}
