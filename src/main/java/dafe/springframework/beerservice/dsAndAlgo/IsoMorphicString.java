package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsoMorphicString {

    public static boolean isomorphicString(String s, String t){
        if(s.length()!=t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length();i++){
            char first = s.charAt(i);
            char second = t.charAt(i);
            if(!map.containsKey(first)){
                map.put(first, second);
            }else{
                if(!set.contains(second)){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String first = "egg";
        String second = "add";

        System.out.println("These strings are Isomorphic : " + isomorphicString(first, second));
    }
}
