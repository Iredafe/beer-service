package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class MinimumNoOfJumps {
    // non-optimal solution
    public static int minimumNoOfJumps(int [] array){
        int [] jump = new int[array.length];
        Arrays.fill(jump, Integer.MAX_VALUE);

         jump[0] = 0;

         for(int i=1; i< array.length; i++){
             for (int j=0;j< i; j++){
                 if(array[j]+j >= i){
                     jump[i] = Math.min(jump[j]+1, jump[i]);
                 }
             }
         }
        return jump[jump.length-1];
    }

    public static void main(String[] args) {
        int [] input ={3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3};

        System.out.println("This is the minimum number of jumps : " + minimumNoOfJumps(input));
    }
}
