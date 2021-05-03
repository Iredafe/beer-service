package dafe.springframework.beerservice.CarGameSystemApp;

public class GasolineFuel implements FuelTypeSelectionStrategy{

    @Override
    public void chooseFuelType() {
        System.out.println("Gasoline fuel selected ...");
    }
}
