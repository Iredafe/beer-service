package dafe.springframework.beerservice.OnsitePrep;

import java.util.Arrays;

public class NextPermutation {

    public static int[] findNextPermutation(int [] inputArray){
        int i = inputArray.length - 2;

        while(i>=0 && inputArray[i+1] < inputArray[i]){
            i--;
        }
        if(i>=0){
            int j = inputArray.length-1;
            while(inputArray[j] < inputArray[i]){
                j--;
            }
            swap(inputArray, i, j);
        }
        reverse(inputArray, i);
        return inputArray;
    }

    private static void reverse(int [] array, int start){
        int i=start+1; int j=array.length-1;
        swap(array, i, j);
    }

    private static void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3};

        System.out.println("This is the next permutation : " + Arrays.toString(findNextPermutation(array)));
    }
}
