package dafe.springframework.beerservice.CarGameSystemApp;

public class AutomaticTransmission implements GearSelectionStrategy{

    @Override
    public void chooseGearType() {
        System.out.println("Automatic transmission gear type selected...");
    }
}
