package dafe.springframework.beerservice.OP;

import java.util.Arrays;

public class PlusOne {

    private static int[] plusOne(int array[]){

        for(int i= array.length-1; i>=0; i--){
            if(array[i] == 9){
                array[i] = 0;
            }else{
                array[i]++;
                return array;
            }
        }
        array = new int[array.length+1];
        array[0]=1;
        return array;
    }

    public static void main(String[] args) {
        int [] digits = {1, 2, 3};
        int[] digits1 = {9,9,9};

        System.out.println("This is the result : " + Arrays.toString(plusOne(digits)));
        System.out.println("This is the result : " + Arrays.toString(plusOne(digits1)));
    }
}
