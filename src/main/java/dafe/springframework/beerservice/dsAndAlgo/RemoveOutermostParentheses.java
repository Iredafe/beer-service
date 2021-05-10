package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Stack;

public class RemoveOutermostParentheses
{


    public static String removeOuterBracket(String parentheses){

        String result ="";

        Stack <Character> myStack = new Stack<>();
        for(int i=0; i<parentheses.length(); i++){
            if(parentheses.charAt(i)=='(' && myStack.isEmpty()){
              myStack.push('(');}
            else if(parentheses.charAt(i)=='(' && !myStack.isEmpty()){
                myStack.push('(');
                result = result + '('; }
            else if(parentheses.charAt(i)==')' && myStack.size()==1){
                myStack.pop();}
            else if(parentheses.charAt(i)==')' && myStack.size()>=1) {
                myStack.pop();
                result = result + ')';
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String test1="(()())(())(()(()))";
        String test2 = "(()())(())";

        System.out.println("This is the first result : " + removeOuterBracket(test1));
        System.out.println("This is the second result : " + removeOuterBracket(test2));
    }


}
