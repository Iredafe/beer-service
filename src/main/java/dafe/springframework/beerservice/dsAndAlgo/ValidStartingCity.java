package dafe.springframework.beerservice.dsAndAlgo;

public class ValidStartingCity {

    public static int validStartingCity(int [] distance, int [] fuel, int mpg){
        int validStartingCity = 0;
        for(int city=0; city < distance.length; city++){
            int startingCity = distance[city];
            for(int gas = city; gas < city + fuel.length; gas++){
                int rotatedIndex = gas % fuel.length;
                if(startingCity - (fuel[rotatedIndex] * mpg) < 0 ){
                    continue;
                }else if(startingCity - (fuel[rotatedIndex] * mpg) >= 0) {
                    validStartingCity= city;
                }
            }
        }
        return validStartingCity;
    }

    public static void main(String[] args) {
        int distance[] = {5, 25, 15, 10, 15};
        int fuel[]={1, 2, 1, 0, 3};
        int mpg=10;

        System.out.println("This is the valid starting city : " + validStartingCity(distance, fuel, mpg));
    }
}

//loop through the cities and initialize the starting city variable
//for each city in city
//for each fuel in fuel
//if fuel[j] * mpg - distance[i] >=0 city is a valid starting city
//if the result is < 0, continue until we find a valid city
