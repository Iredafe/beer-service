package dafe.springframework.beerservice.OP;

import java.util.Stack;

public class DecodeString {

    private static String decodeString(String input){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        int k=0;
        StringBuilder decodedString = new StringBuilder();

        for(char character : input.toCharArray()){
            if(Character.isDigit(character)){
                k=k*10 + character-'0';
            }else if(character == '['){
                countStack.push(k);
                stringStack.push(decodedString);
                decodedString = new StringBuilder();
                k=0;
            }else if(character == ']'){
                StringBuilder currentString = stringStack.pop();
                for(int currentK = countStack.pop(); currentK >0; currentK--){
                    currentString.append(decodedString);
                }
                decodedString = currentString;
            }else{
                decodedString.append(character);
            }
        }
        return decodedString.toString();
    }
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println("This is the decoded string : " + decodeString(s));
    }
}
