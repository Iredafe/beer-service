package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class MinimumNoOfCoinsForChange {

    public static int minimumNoOfCoinsForChange(int target, int [] denominations){
        int [] numOfCoins = new int [target+1];
        Arrays.fill(numOfCoins, Integer.MAX_VALUE);
        numOfCoins[0] = 0;
        int toCompare = 0;
        for(int denom : denominations){
            for(int amount = 0; amount < target+1; amount++){
                if(denom <= amount){
                    if(numOfCoins[amount-denom] == Integer.MAX_VALUE){
                        toCompare = numOfCoins[amount-denom];
                    }else{
                        toCompare = numOfCoins[amount-denom]+1;
                    }
                    numOfCoins[amount] = Math.min(numOfCoins[amount], toCompare);
                }
            }
        }
        return numOfCoins[target] != Integer.MAX_VALUE ? numOfCoins[target] : -1;
    }

    public static void main(String[] args) {

        int target = 6;
        int [] denom = {1,2,4};

        int target1 = 7;
        int [] denom1 = {10, 1, 5};

        int result = minimumNoOfCoinsForChange(target, denom);
        int result1 = minimumNoOfCoinsForChange(target1, denom1);
        System.out.println("This is the minimum no of coins for change " + result);
        System.out.println("This is the minimum no of coins for change " + result1);
    }


}
