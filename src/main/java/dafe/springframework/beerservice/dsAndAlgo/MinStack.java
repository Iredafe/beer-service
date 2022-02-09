package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Stack;

public class MinStack {
    Stack<int[]> stack;
    public MinStack() {
        stack  = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new int[]{val,val});
            return;
        }
        int currentMin = stack.peek()[1];
        stack.push(new int[]{val, Math.min(val,currentMin)});
    }

    public void pop() {

        if(!stack.isEmpty()){
            stack.pop();
            return;
        }
    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.peek()[0];
        }
        return -1;
    }

    public int getMin() {
        return stack.peek()[1];
    }
}

class MinStackConstruction{


}

class Element{
    int value;
    int minValue;

    public Element(int value, int minValue){
        this.value = value;
        this.minValue = minValue;
    }

    public int getValue(){
        return value;
    }

    public int getMinValue(){
        return minValue;
    }
}
