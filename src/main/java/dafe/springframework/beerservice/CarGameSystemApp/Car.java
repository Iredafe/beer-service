package dafe.springframework.beerservice.CarGameSystemApp;

public abstract class Car {

protected String name;
protected String model;
protected String color;
protected int noOfDoors;
protected int noOfTires;
protected int maxSpeed;
protected double price;
protected FuelTypeSelectionStrategy fuelTypeSelectionStrategy;
protected GearSelectionStrategy gearSelectionStrategy;

public abstract void createCar();

public void start(){
    System.out.println("Car has been started...");
}

public void stop(){
    System.out.println("Car has been stopped");
}

public void selectFuel(){
fuelTypeSelectionStrategy.chooseFuelType();
}

public void selectGearTransmission(){
gearSelectionStrategy.chooseGearType();
}


}
