package dafe.springframework.beerservice.dsAndAlgo;

import java.util.EmptyStackException;

public class StackImpl <Dafe>{

    private static class StackNode<Dafe>{
        private Dafe data;
        private StackNode<Dafe> next;

        public StackNode(Dafe data) {
            this.data=data;
        }
    }

    private StackNode<Dafe> top;
    public Dafe pop(){
        if(top==null) throw new EmptyStackException();
        Dafe item = top.data;
        top =top.next;
        return item;
    }

    public void push(Dafe item){
        StackNode<Dafe> t = new StackNode<Dafe>(item);
        t.next = top;
        top=t;
    }

    public Dafe  peek(){
        if(top==null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty(){
        return top ==null;
    }

    public static void main(String[] args) {
        StackImpl myStack = new StackImpl();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);


        System.out.println(myStack.pop() + " Popped from stack");
        System.out.println("Top element is " + myStack.peek());
        System.out.println("The stack is empty? " + myStack.isEmpty());

    }
}
