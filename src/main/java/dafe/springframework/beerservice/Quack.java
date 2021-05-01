package dafe.springframework.beerservice;

public class Quack implements IQuackBehavior {
    public void quack(){
        System.out.println("I am quacking");
    }
}
