package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;

public class TripletsCloseToTarget {

    private static int searchTriplet(int [] array, int target){
        Arrays.sort(array);
        int sum=Integer.MAX_VALUE;
        for (int i=0; i<array.length && array[i]<=0; i++){
            if(i==0 || array[i-1] != array[i]){
                getTripletsCloseToSum(array, i, sum);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(searchTriplet(new int[] { -2, 0, 1, 2 }, 2));
        System.out.println(searchTriplet(new int[] { -3, -1, 1, 2 }, 1));
        System.out.println(searchTriplet(new int[] { 1, 0, 1, 1 }, 100));
    }
}
