package dafe.springframework.beerservice.simuduck;

import dafe.springframework.beerservice.simuduck.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
    public void fly(){
        System.out.println("I am flying");
    }
}
