package dafe.springframework.beerservice.CarGameSystemApp;

public class Tank extends Car{

    public Tank(){
        gearSelectionStrategy=new ManualTransmission();
        fuelTypeSelectionStrategy = new DieselFuel();
    }

    @Override
    public void createCar() {
        System.out.println("A new tank car was created");
    }

    @Override
    public void start() {
        System.out.println("Tank car has started");
    }
}
