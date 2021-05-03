package dafe.springframework.beerservice.CarGameSystemApp;

public class ManualTransmission implements GearSelectionStrategy{


    @Override
    public void chooseGearType() {
        System.out.println("Manual transmission gear selected");
    }
}
