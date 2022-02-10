package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    Map<Character, Character> map = Map.of('{','}','[',']','(',')');
    public static boolean isValid(String input){

    Stack<Character> stack = new Stack<>();

    for(int i=0; i<input.length(); i++){
        char bracket = input.charAt(i);
    }
        return false;
    }

    public static void main(String[] args) {
        String s = "(])";
        System.out.println("This is a valid parenthesis : " + isValid(s));
    }
}
