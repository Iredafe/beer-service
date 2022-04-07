package dafe.springframework.beerservice.dsAndAlgo;

public class AmbigousMeasurements {

    public static boolean ambiguousMeasurements(int [][] measuringCups, int low, int high){

        return true;
    }


    public static void main(String[] args) {
        int[][] measuringCups = {{200, 210},
        {450, 465},
        {800, 850}};
        int low = 2100;
        int high = 2300;

        System.out.println("These measuring cups can be measured ? " + ambiguousMeasurements(measuringCups, low, high));
    }
}
