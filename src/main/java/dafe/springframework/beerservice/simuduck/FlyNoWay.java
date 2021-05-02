package dafe.springframework.beerservice.simuduck;

import dafe.springframework.beerservice.simuduck.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {

    public void fly() {
        System.out.println("I don'f fly..");
    }
}
