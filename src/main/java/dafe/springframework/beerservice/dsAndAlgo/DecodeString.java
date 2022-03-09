package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String input){
        Stack<Character> stack = new Stack();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch != ']'){
                stack.push(ch);
            }
        }
        return "";
    }
}
