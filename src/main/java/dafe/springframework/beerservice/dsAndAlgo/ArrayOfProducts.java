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

    public static int[] arrayOfProductsSecondApproach(int[] array){
        int [] products = new int[array.length];
        int [] leftArray = new int[array.length];
        int rightArray[] = new int [array.length];

        int leftRunningSum = 1;
        for(int i=0; i<array.length; i++){
            leftArray[i] = leftRunningSum;
            leftRunningSum *= array[i];
        }

        int rightRunningSum =1;
        for(int i= array.length-1; i>=0; i--){
            rightArray[i] = rightRunningSum;
            rightRunningSum *=array[i];
        }

        for(int i=0; i< array.length; i++){
            products[i] = leftArray[i] * rightArray[i];
        }
        return products;
    }

    public static void main(String[] args) {

        int [] input = {5, 1, 4, 2}; //1,2,4,5
                                    //10,20,40,8
        int [] input2={-5, 2, -4, 14, -6};
        int [] result2 = arrayOfProducts(input2);
        int [] result =arrayOfProducts(input);

        int [] resultA = arrayOfProductsSecondApproach(input2);
        int [] resultB =arrayOfProductsSecondApproach(input);

        System.out.println("This is the result of array of products : " + Arrays.toString(result));
        System.out.println("This is the result of array of products : " + Arrays.toString(result2));

        System.out.println("This is the result of array of products : " + Arrays.toString(resultA));
        System.out.println("This is the result of array of products : " + Arrays.toString(resultB));
    }
}
