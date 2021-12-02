package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class ArrayOfProducts {

    public static int[] arrayOfProducts(int [] array){

        int product [] = new int[array.length];

        for(int firstPointer = 0; firstPointer< array.length; firstPointer++){
            int runningProduct = 1;
            for(int secondPointer = 0; secondPointer<array.length; secondPointer++){
                if(firstPointer!=secondPointer){
                    runningProduct *= array[secondPointer];
                }
                product[firstPointer] = runningProduct;
            }
        }
        return product;
    }

    public static void main(String[] args) {

        int [] input = {5, 1, 4, 2}; //1,2,4,5
                                    //10,20,40,8
        int [] result =arrayOfProducts(input);
        System.out.println("This is the result of array of products : " + Arrays.toString(result));
    }
}
