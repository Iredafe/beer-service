package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Stack;
/*
Given a string S of lowercase letters, a duplicate removal consists of choosing
two adjacent and equal letters, and removing them.
We repeatedly make duplicate removals on S until we no longer can.
Return the final string after all such duplicate removals have been made.
 It is guaranteed the answer is unique.


 */

public class RemoveDuplicates {

    public static String removeDuplicates(String S){

        Stack <Character> stackWithoutDuplicate = new Stack<>();

        for(char letter : S.toCharArray()){
            if(stackWithoutDuplicate.isEmpty() || stackWithoutDuplicate.peek()!=letter){
                stackWithoutDuplicate.push(letter);
            }else {
                stackWithoutDuplicate.pop();
            }
        }

        char[] convertedResult = new char[stackWithoutDuplicate.size()];
        for(int i=convertedResult.length-1; i>=0; i--){
            convertedResult[i]= stackWithoutDuplicate.pop();
        }


        return new String(convertedResult);
    }

    public static String removeDuplicates2(String S){

        Stack <Character> stackWithoutDuplicate = new Stack<>();

        for(char letter : S.toCharArray()){
            if(stackWithoutDuplicate.isEmpty() || stackWithoutDuplicate.peek()!=letter){
                stackWithoutDuplicate.push(letter);
            }else {
                stackWithoutDuplicate.pop();
            }
        }

    StringBuilder myStringBuilder = new StringBuilder();
        while(!stackWithoutDuplicate.isEmpty()){
            myStringBuilder.append(stackWithoutDuplicate.pop());
        }

        return myStringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String test ="abbacaabd";

        System.out.println("This is the processed String without duplicate : " + removeDuplicates(test));
        System.out.println("This is the processed String without duplicate2 : " + removeDuplicates2(test));
    }
}
