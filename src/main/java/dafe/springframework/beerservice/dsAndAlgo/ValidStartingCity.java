package dafe.springframework.beerservice.dsAndAlgo;

public class ValidStartingCity {

    public static int validStartingCity(int [] distance, int [] fuel, int mpg){

        return 1;
    }

    public static void main(String[] args) {
        int distance[] = {5, 25, 15, 10, 15};
        int fuel[]={1, 2, 1, 0, 3};
        int mpg=10;

        System.out.println("This is the valid starting city : " + validStartingCity(distance, fuel, mpg));
    }
}
