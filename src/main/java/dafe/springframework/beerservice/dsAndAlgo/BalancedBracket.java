package dafe.springframework.beerservice.dsAndAlgo;

import org.springframework.boot.actuate.endpoint.web.Link;

import java.util.*;

public class BalancedBracket {

    public static boolean balancedBracket(String input) {
        String openingBrackets = "({[";
        String closingBrackets = ")}]";
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')','(');
        matchingBrackets.put('}', '{');
        matchingBrackets.put(']','[');

        List<Character> myStack = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            char letter = input.charAt(i);
            if(openingBrackets.indexOf(letter) != -1){
                myStack.add(letter);
            }else if(closingBrackets.indexOf(letter) != -1){
                if(myStack.size()==0) return false;
                else if(myStack.get(myStack.size()-1) == matchingBrackets.get(letter)){
                    myStack.remove(myStack.size()-1);
                }else{
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }

    //this solution does not take the order into account
    public static boolean balancedBrackets(String input){

        Map <Character, Character> mappings = new HashMap<>();
        Stack<Character> myStack = new Stack<>();
        mappings.put(')','(');
        mappings.put('}','{');
        mappings.put(']','[');

        for(int i = 0; i<input.length(); i++){
            char currentCharacter = input.charAt(i);
            if(mappings.containsKey(currentCharacter)){
                char topElement = myStack.isEmpty() ? '#' : myStack.pop();
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "([])(){}(())()()";
        System.out.println("This input is a balanced bracket : " + balancedBracket(input));
        System.out.println("This input is a balanced bracket 1 : " + balancedBrackets(input));

    }
}