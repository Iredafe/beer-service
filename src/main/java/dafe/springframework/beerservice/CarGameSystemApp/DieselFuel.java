package dafe.springframework.beerservice.CarGameSystemApp;

public class DieselFuel implements FuelTypeSelectionStrategy{


    @Override
    public void chooseFuelType() {
        System.out.println("Diesel fuel type selected ...");
    }
}
