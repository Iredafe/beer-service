package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZero {

    private static List<List<Integer>> searchTriplets(int [] array){

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<array.length && array[i]<=0; i++){
            if(i==0 || array[i-1] != array[i]){
                getTwoSum(array, i, result);
            }
        }
        return result;
    }


    private static List<List<Integer>> getTwoSum(int [] array, int index, List<List<Integer>> result){

        int left=index+1; int right=array.length-1;

        while(left<right){
            int sum = array[index] + array[left] + array[right];
            if(sum == 0){
                result.add(Arrays.asList(array[index], array[left], array[right]));
                left++;
                right--;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(TripletSumToZero.searchTriplets(
                new int[] { -3, 0, 1, 2, -1, 1, -2 }));
        System.out.println(TripletSumToZero.searchTriplets(new int[] { -5, 2, -1, -2, 3 }));
    }
}
