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
            int count = slidingWindowMap.getOrDefault(character, 0);
            slidingWindowMap.put(character, count);

            if(slidingWindowMap.containsKey(character) && map.get(character).equals(slidingWindowMap.get(character))){
                formed++;
            }

            while(left<right && formed == requiredSize){
                char leftCharacter = longString.charAt(left);
               if(answer[0] == -1 || (right-left+1) < answer[0]){
                   answer[0] = right-left+1;
                   answer[1] = left;
                   answer[2] = right;
               }
              slidingWindowMap.put(character, slidingWindowMap.get(character)-1);
               if(slidingWindowMap.containsKey(leftCharacter) && slidingWindowMap.get(leftCharacter).intValue() < map.get(leftCharacter)){
                   formed--;
               }
               left++;
            }
        }
            right++;

        return answer[0]==0?"":longString.substring(answer[1], answer[right]+1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("This is the minimum window : " + findMinimumWindowSubstring(s, t));
    }
}
