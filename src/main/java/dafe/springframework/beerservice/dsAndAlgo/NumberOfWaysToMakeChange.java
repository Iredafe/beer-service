package dafe.springframework.beerservice.dsAndAlgo;

public class NumberOfWaysToMakeChange {


    public static int numberOfWaysToMakeChange(int [] denominations, int targetAmount){

        int [] ways = new int[targetAmount+1];
        ways[0] = 1;
        for(int denomination : denominations){
            for(int amount=1; amount < targetAmount+1; amount++){
                if(denomination<=amount){
                    ways[amount] += ways[amount-denomination];
                }
            }
        }
        return ways[targetAmount];
    }

    public static void main(String[] args) {
        int denoms [] = {2, 3, 4, 7};
        int denoms1[] = {1,5};
        int target = 0;
        int target1= 6;

        int result = numberOfWaysToMakeChange(denoms, target);
        int result1 = numberOfWaysToMakeChange(denoms1,target1);
        System.out.println("The number of ways is : " + result);
        System.out.println("The number of ways is : " + result1);
    }
}
