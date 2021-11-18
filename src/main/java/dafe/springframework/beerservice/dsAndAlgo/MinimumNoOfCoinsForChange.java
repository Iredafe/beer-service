package dafe.springframework.beerservice.dsAndAlgo;

public class MinimumNoOfCoinsForChange {

    public static int minimumNoOfCoinsForChange(int target, int [] denominations){


        return -1;
    }

    public static void main(String[] args) {

        int target = 7;
        int [] denom = {1,5,10};

        int target1 = 7;
        int [] denom1 = {10, 1, 5};

        int result = minimumNoOfCoinsForChange(target, denom);
        int result1 = minimumNoOfCoinsForChange(target1, denom1);
        System.out.println("This is the minimum no of coins for change " + result);
        System.out.println("This is the minimum no of coins for change " + result1);
    }


}
