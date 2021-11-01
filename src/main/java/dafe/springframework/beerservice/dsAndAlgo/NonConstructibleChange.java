package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class NonConstructibleChange {

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        int change = 0;
//sort input
        Arrays.sort(coins);
        //loop through the sorted input and add the inputs
     for(int coin:coins){
         //if the change + 1 is < a given number in an index, then we cannot make the change, return change+1
         if(coin> change+1){
                return change+1;
             //if the change is less than or equal to the given number in an index, we can make the change,
         }
         //add the coin to change
             change+=coin;

     }
        return change+1;
    }
    public static void main(String[] args) {
        int[] input ={5, 7, 1, 1, 2, 3, 22}; //sorted = {1,1,2,3,5,7,22}
        System.out.println("The minimum change is : " + nonConstructibleChange(input));
    }
}
