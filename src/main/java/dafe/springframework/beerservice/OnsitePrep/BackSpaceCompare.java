package dafe.springframework.beerservice.OnsitePrep;

import java.util.Stack;

public class BackSpaceCompare {

    private static boolean backSpaceCompare(String s, String t){

        return buildString(s).equals(buildString(t));
    }


    private static String buildString(String string){
        Stack<Character> stack = new Stack<>();

        for(char character : string.toCharArray()){
            if(character!='#') stack.push(character);
            else stack.pop();
        }
        return stack.toString();
    }

    private static String getString(String string){


        return "";
    }

    private static boolean backspaceCompare(String s, String t){
        return getString(s).equals(getString(t));
    }

    public static void main(String[] args) {
        String first = "ab#c";
        String second = "ad#c";

        System.out.println("Both strings are same ? " + backSpaceCompare(first, second));
    }
}
