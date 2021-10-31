package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class NonConstructibleChange {

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        int change = 0;
//sort input
        Arrays.sort(coins);
        //loop through the sorted input and add the inputs
     for(int index=0; index<coins.length; index++){
         //if the change + 1 is < a given number in an index, then we cannot make the change, return change+1
         if((change+1)< coins[index]){
                change+=1;
             //if the change is greater than or equal to the given number in an index, we can make the change, add the coin to change
         }else if((change+1) >= coins[index]){
             change+=coins[index];
         }
     }
        return change;
    }
    public static void main(String[] args) {
        int[] input ={5, 7, 1, 1, 2, 3, 22};
        System.out.println("The minimum change is : " + nonConstructibleChange(input));
    }
}
