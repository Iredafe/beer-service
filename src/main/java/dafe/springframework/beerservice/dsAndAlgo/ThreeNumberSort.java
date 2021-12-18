package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class ThreeNumberSort {

    public static int[] threeNumberSort(int [] array, int [] order){
        int firstOrderValue = order[0];
        int thirdOrderValue = order[2];

        int firstIdx = 0;
        int thirdIdx = array.length-1;

        for(int index = 0; index < array.length; index++){
            int value = array[index];
            if(value==firstOrderValue){
                swap(firstIdx, index, array);
                firstIdx++;
            }
        }

        for(int index = array.length-1; index >=0; index--){
            int value = array[index];
            if(value == thirdOrderValue){
                swap(thirdIdx, index, array);
                thirdIdx--;
            }
        }
        return array;
    }

    public static void swap(int i, int j, int [] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        int input[] = {1, 0, 0, -1, -1, 0, 1, 1};
        int [] order ={0, 1, -1};

        System.out.println("This is the sorted array : " + Arrays.toString(threeNumberSort(input, order)));
    }
}
