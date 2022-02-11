package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static int evaluate(String[] tokens){

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(!"*/+-".contains(token)){
                stack.push(Integer.valueOf(token));
                continue;
            }
            int number2 = stack.pop();
            int number1 = stack.pop();
            int result=0;
            switch (token){
                case "*": result= number1 * number2;
                break;
                case "/": result= number1 / number2;
                break;
                case "+": result= number1 + number2;
                break;
                case "-": result= number1 - number2;
                break;
            }

            stack.push(result);

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String [] tokens ={"2","1","+","3","*"};

        System.out.println("This is the result of reverse polish notation : " + evaluate(tokens));
    }
}
