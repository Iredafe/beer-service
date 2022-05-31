package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;

public class TripletsCloseToTarget {

    private static int searchTriplet(int [] array, int target){
        Arrays.sort(array);
        int tripletsSumCloseToTarget=Integer.MAX_VALUE;
        for (int i=0; i<array.length && array[i]<=0; i++){
            if(i==0 || array[i-1] != array[i]){
                getTripletsCloseToTarget(array, i, tripletsSumCloseToTarget, target);
            }
        }
        return tripletsSumCloseToTarget;
    }

    private static int getTripletsCloseToTarget(int[] array, int index, int runningClosestSum, int target){
        int left= index+1; int right = array.length-1;

        while(left < right){
            int currentSum = array[index] + array[left] + array[right];
            int difference = Math.abs(currentSum-target);
            if(difference<runningClosestSum){
                runningClosestSum=difference;
                left++;
                right--;
            }else{

            }
        }

    }


    public static void main(String[] args) {
        System.out.println(searchTriplet(new int[] { -2, 0, 1, 2 }, 2));
        System.out.println(searchTriplet(new int[] { -3, -1, 1, 2 }, 1));
        System.out.println(searchTriplet(new int[] { 1, 0, 1, 1 }, 100));
    }
}
