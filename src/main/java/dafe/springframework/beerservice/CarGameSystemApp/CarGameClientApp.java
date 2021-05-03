package dafe.springframework.beerservice.CarGameSystemApp;

public class CarGameClientApp {


    public static void main(String[] args) {
        Car tank = new Tank();
        tank.selectFuel();
        tank.selectGearTransmission();
        tank.createCar();
        tank.start();
        tank.stop();
    }

}
