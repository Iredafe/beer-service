package dafe.springframework.beerservice.dsAndAlgo;

public class MinMaxStackImplementation {

    static  class MinMaxStack {
         public int peek(){
             return -1;
         }

         public int pop(){
             return -1;
         }

         public void push(Integer number){

         }

         public int getMin(){
             return -1;
         }

         public int getMax(){
             return -1;
         }

    }


    public static void main(String[] args) {
        MinMaxStack stack = new MinMaxStack();
        stack.pop();
        stack.push(3);
        stack.push(2);
        System.out.println(" Stack 1 : " + stack);
        stack.push(9);
        stack.getMax();
        stack.getMin();
        System.out.println(" Stack 2 : " + stack);
        stack.push(10);
        stack.push(1);
        stack.peek();
        System.out.println(" Stack 3 : " + stack);
        stack.getMax();
        stack.pop();
        stack.getMin();
        System.out.println(" Stack 4 : " + stack);

    }


}
