package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
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

    ArrayList<Element> stack = new ArrayList();

    public void push(int val){
        if(stack.isEmpty()){
            stack.add(new Element(val, val));
            return;
        }
        int currentMinValue = stack.get(stack.size()-1).getMinValue();
        stack.add(new Element(val, Math.min(val, currentMinValue)));
    }

    public void pop(){
        stack.remove(stack.size()-1);
    }

    public int top(){
        return stack.get(stack.size()-1).getValue();
    }

    public int getMin(){
        return stack.get(stack.size()-1).getMinValue();
    }
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

    class MinStackConstructionII{
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        public void push(int val){
            stack.push(val);
            if(stack.isEmpty() || minStack.peek() <= val){
                minStack.push(val);
            }
        }

        public void pop(){
            if(minStack.peek() == stack.peek()){
                minStack.pop();
            }
            stack.pop();

        }

        public int top(){
            return stack.peek();
        }

        public int getMin(){
            return minStack.peek();
        }

    }
}
