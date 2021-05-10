package dafe.springframework.beerservice.dsAndAlgo;

/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.


*/

import java.util.Stack;

public class BackspaceCompare {

    public  static boolean backspaceCompare(String t, String s){

        return buildString(t).equals(buildString(s));
    }

    private static String buildString(String myString){
        Stack <Character> myStack = new Stack<>();
        for(char letter : myString.toCharArray()){
            if(letter!='#')
                myStack.push(letter);
            else if(!myStack.isEmpty())
                myStack.pop();
        }
        return String.valueOf(myStack);
    }


    public static void main(String[] args) {
        String test1="ab#c";
        String test2="cb##c";        String test3="cb##ac";
        System.out.println("The result is : " + backspaceCompare(test1, test2));
        System.out.println("The result is : " + backspaceCompare(test1, test3));
    }

}
