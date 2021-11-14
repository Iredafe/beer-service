package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class FindThreeLargestNumber {

    public static int[] findThreeSum(int [] array){

        int [] result = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for(int index=0; index<array.length; index++){
            updateLargestNumber(result, array[index]);
        }
        return result;
    }

    private static void updateLargestNumber(int[] result, int number) {
        if(number > result[2]){
            shiftAndUpdate(result, number, 2);
        }else if(number > 1){
            shiftAndUpdate(result, number, 1);
        }else if(number > 0){
            shiftAndUpdate(result, number, 0);
        }
    }

    private static void shiftAndUpdate(int [] array, int number, int index){
        for(int idx=0; idx<= index; idx++){
         if(idx == index){
             array[idx] = number;
         }else {
             array[idx] = array[idx+1];
         }
        }
    }

    public static void main(String[] args) {
        int [] input =new int [] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
    int [] result = findThreeSum(input);
        System.out.println("These are the three largest numbers in the array : " + Arrays.toString(result));
    }
}
