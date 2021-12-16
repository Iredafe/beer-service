package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int [] array){

        int [] result = new int[array.length];
        Arrays.fill(result, -1);

        Stack <Integer> stack = new Stack<>();

        for(int index=0; index < 2*array.length; index++){
            int circularIndex = index % array.length;
            while(stack.size() > 0 && array[stack.peek()] < array[circularIndex]){
                int top = stack.pop();
                result[top] = array[circularIndex];
            }
            stack.push(circularIndex);
        }
        return result;
    }


    public static void main(String[] args) {
        int input [] = {2, 5, -3, -4, 6, 7, 2};

        System.out.println
                ("This is the result of nex greater element function : "
                        + Arrays.toString(nextGreaterElement(input)));
    }
}
