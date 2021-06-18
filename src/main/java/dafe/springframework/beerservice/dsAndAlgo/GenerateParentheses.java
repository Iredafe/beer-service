package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
        //use recursion

        //check whether the sequence is valid

        //keep track of balance

        //find the net number of opening brackets minus closing brackets
        public static List<String> generateParentheses(int n) {
            List <String> combinations = new ArrayList<>();
            generateAll(new char[2*n], 0 , combinations);
            return combinations;

    }
        public static void generateAll(char[] current, int pos, List<String> result){
            if(pos== current.length){
                if(valid(current)){
                    result.add(new String(current));
                }
            } else{
                current[pos] ='(';
                generateAll(current, pos+1, result);
                current[pos] =')';
                generateAll(current, pos+1, result);
            }
        }

        public static boolean valid(char[] current){
        int balance = 0;
        for(char c: current){
            if(c=='(')balance++;
            else balance--;
            if(balance<0) return false;
        }
            return (balance ==0);
    }

    public static void main(String[] args) {
        int input = 5;
        System.out.println("The output is : " + generateParentheses(input));
    }

    }


