package dafe.springframework.beerservice.OnsitePrep;

import java.util.Stack;

public class DecodeString {

    private static String decodeString(String input){
        Stack<Integer> countStack = new Stack<>();
        Stack<Integer> stringStack = new Stack<>();
        int k=0;
        StringBuilder decodedString = new StringBuilder();
    }
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println("This is the decoded string : " + decodeString(s));
    }
}
