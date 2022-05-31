package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;

public class TripletsCloseToTarget {
    static int difference;
    private static int searchTriplet(int [] array, int target){
        difference =Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int i = 0; i<array.length && difference !=0; i++){
            int left= i+1; int right = array.length-1;
            if(i==0 || array[i-1] != array[i]){
                while(left < right){
                    int currentSum = array[i] + array[left] + array[right];
                    if(Math.abs(target-currentSum)< difference){
                        difference =target-currentSum;
                    }else if(currentSum<target) left++;
                    else right--;
                }
            }
        }
        return target-difference;
    }



    public static void main(String[] args) {
        System.out.println(searchTriplet(new int[] { -2, 0, 1, 2 }, 2));
        System.out.println(searchTriplet(new int[] { -3, -1, 1, 2 }, 1));
        System.out.println(searchTriplet(new int[] { 1, 0, 1, 1 }, 100));
    }
}
