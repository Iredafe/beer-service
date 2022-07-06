package dafe.springframework.beerservice.Grokking;

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
        int n = string.length();
        int count = 0;
        String result="";

        for(int i=n-1; i>=0; i--){
            char character = string.charAt(i);
            if(character == '#') count++;
            else{
                if(count > 0) count--;
                else{
                    result += character;
                }
            }
            return result;
        }

        return "";
    }

    private static boolean backspaceCompare(String s, String t){
        return getString(s).equals(getString(t));
    }

    public static void main(String[] args) {
        String first = "ab#c";
        String second = "ad#c";

        System.out.println("Both strings are same ? " + backSpaceCompare(first, second));
        System.out.println("Both strings are same 2 ? " + backspaceCompare(first, second));
    }
}
