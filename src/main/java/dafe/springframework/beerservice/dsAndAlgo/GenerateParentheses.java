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

    public static List<String> generateParenthesis2(int number) {

        List<String> answer = new ArrayList<>();
        if (number == 0) {
            answer.add("");
        } else {
            for (int i = 0; i < number; i++)
                for (String left : generateParentheses(i))
                    for (String right : generateParentheses(number - 1 - i))
                        answer.add("(" + left + ")" + right);
        }
        return answer;


    }

    public static void main(String[] args) {
        int input = 5;
        int input2 = 3;
        System.out.println("The output is : " + generateParentheses(input));
        System.out.println("The output is : " + generateParenthesis2(input2));
    }

    }


