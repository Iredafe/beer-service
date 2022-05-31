package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;

public class TripletsCloseToTarget {
    static int tripletsSumCloseToTarget;
    private static int searchTriplet(int [] array, int target){
        tripletsSumCloseToTarget=Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int i=0; i<array.length && array[i]<=0; i++){
            int left= i+1; int right = array.length-1;
            if(i==0 || array[i-1] != array[i]){
                while(left < right){
                    int currentSum = array[i] + array[left] + array[right];
                    int difference = Math.abs(currentSum-target);
                    if(difference<tripletsSumCloseToTarget){
                        tripletsSumCloseToTarget=difference;
                        left++;
                        right--;
                    }
                }
            }
        }
        return tripletsSumCloseToTarget;
    }



    public static void main(String[] args) {
        System.out.println(searchTriplet(new int[] { -2, 0, 1, 2 }, 2));
        System.out.println(searchTriplet(new int[] { -3, -1, 1, 2 }, 1));
        System.out.println(searchTriplet(new int[] { 1, 0, 1, 1 }, 100));
    }
}
