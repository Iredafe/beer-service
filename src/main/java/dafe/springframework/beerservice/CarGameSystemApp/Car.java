package dafe.springframework.beerservice.CarGameSystemApp;

public abstract class Car {

protected String name;
protected String model;
protected String color;
protected int noOfDoors;
protected int noOfTires;
protected int maxSpeed;
protected double price;

public void start(){
    System.out.println("Car has been started...");
}

public void stop(){
    System.out.println("Car has been stopped");
}

public void selectFuel(){

}

public void selectGearTransmission(){

}


}
