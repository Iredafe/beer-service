package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Stack;

public class BaseballGame {

    public  static int calculatePoints(String[] ops){

        Stack <Integer> myStack = new Stack<>();
        int result = 0;
        for(String op : ops){
            if(op.equals("+")){
                int top = myStack.pop();
                int newTop = top + myStack.peek();
                myStack.push(top);
                myStack.push(newTop);
            }else if(op.equals("C")){
                myStack.pop();
            }else if(op.equals("D")){
                myStack.push(2* myStack.peek());
            }else{
                myStack.push(Integer.valueOf(op));
            }
        }
        for(int score: myStack)
            result += score;
    return result;
    }


    public static void main(String[] args) {

        String [] test = {"5","2","C","D","+"};
        String [] test2 = {"5","-2","4","C","D","9","+","+"};
        System.out.println("This is the result : " + calculatePoints(test));
        System.out.println("This is the result : " + calculatePoints(test2));
    }

}
