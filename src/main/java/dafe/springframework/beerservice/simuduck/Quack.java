package dafe.springframework.beerservice.simuduck;

import dafe.springframework.beerservice.simuduck.IQuackBehavior;

public class Quack implements IQuackBehavior {
    public void quack(){
        System.out.println("I am quacking");
    }
}
