package dafe.springframework.beerservice.dsAndAlgo;

public class ValidStartingCity {

    public static int validStartingCity(int [] distance, int [] fuel, int mpg){
        int validStartingCity = 0;
        int numberOfCities = distance.length;
        for(int city = 0; city < numberOfCities; city++){
            for(int currentCityIdx = city; currentCityIdx < city + numberOfCities; currentCityIdx++){
                int currentCityRotatedIndex = currentCityIdx % numberOfCities;
                if((fuel[currentCityRotatedIndex] * mpg) - distance[currentCityRotatedIndex] < 0 ){
                    continue;
                }else if((fuel[currentCityRotatedIndex] * mpg) - distance[currentCityRotatedIndex]  >= 0) {
                    validStartingCity= city;
                }
            }
        }
        return validStartingCity;
    }

    public static int validStartingCity1(int [] distance, int []fuel, int mpg){
        int numberOfCities = distance.length;
        for(int startCityIdx = 0; startCityIdx< numberOfCities; startCityIdx++){
            int milesRemaining = 0;
            for(int currentCityIdx= startCityIdx; currentCityIdx < startCityIdx+numberOfCities; currentCityIdx++) {
                if (milesRemaining < 0) continue;

                int currentCityRotatedIndex = currentCityIdx % numberOfCities;
                int distanceToNextCity = distance[currentCityRotatedIndex];
                int fuelFromCurrentCity = fuel[currentCityRotatedIndex];

                milesRemaining += (fuelFromCurrentCity * mpg) - distanceToNextCity;
            }
                if(milesRemaining >= 0) return startCityIdx;
            }
        return -1;
    }

    public static void main(String[] args) {
        int distance[] = {5, 25, 15, 10, 15};
        int fuel[]={1, 2, 1, 0, 3};
        int mpg=10;

        int distance1[] = {10, 20, 10, 15, 5, 15, 25};
        int fuel1[]={0, 2, 1, 0, 0, 1, 1};
        int mpg1=20;

        System.out.println("This is the valid starting city : " + validStartingCity1(distance, fuel, mpg));
        System.out.println("This is the valid starting city : " + validStartingCity1(distance1, fuel1, mpg1));
    }
}

//loop through the cities and initialize the starting city variable
//for each city in city
//for each fuel in fuel
//if fuel[j] * mpg - distance[i] >=0 city is a valid starting city
//if the result is < 0, continue until we find a valid city
