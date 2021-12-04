package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumberSum {

    public static List<Integer[]>  fourNumberSum(int [] array, int target){
        Map<Integer, List<Integer[]>> allPairsSum = new HashMap<>();
        List<Integer[]> quadruplets = new ArrayList<>();

        return quadruplets;
    }


    public static void main(String[] args) {

        int [] array = {7, 6, 4, -1, 1, 2};
        int target = 16;
        System.out.println("These are the four number sums : " + fourNumberSum(array, target));
    }
}
