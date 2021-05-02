package dafe.springframework.beerservice.simuduck;

import dafe.springframework.beerservice.simuduck.Duck;
import dafe.springframework.beerservice.simuduck.MallardDuck;

public class MiniSimulatorDuck {
    public static void main(String[] args) {
        Duck mullard = new MallardDuck();
        mullard.performQuack();
        mullard.performFly();
    }
}
