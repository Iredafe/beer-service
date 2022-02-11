package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static int evaluate(String[] tokens){

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if("*/+-".contains(token)){
                stack.push(Integer.valueOf(token));
                continue;
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        String [] tokens ={"2","1","+","3","*"};

        System.out.println("This is the result of reverse polish notation : " + evaluate(tokens));
    }
}
