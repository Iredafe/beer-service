package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.List;

public class FourSum {

    private static List<List<Integer>> searchQuadruplets(int [] array, int target){
        for(int firstIndex=0; firstIndex<array.length-3; firstIndex++){
            if(firstIndex>0 && array[firstIndex]== array[firstIndex-1])
                continue;
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println(searchQuadruplets(new int[] { 4, 1, 2, -1, 1, -3 }, 1));
        System.out.println(searchQuadruplets(new int[] { 2, 0, -1, 1, -2, 2 }, 2));
    }
}
