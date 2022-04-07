package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;

public class AmbigousMeasurements {

    public static boolean ambiguousMeasurements(int [][] measuringCups, int low, int high){

        HashMap<String, Boolean> memoization = new HashMap();
        return canMeasureInRange(measuringCups, low, high, memoization);
    }

    public static boolean canMeasureInRange(int[][] measuringCups, int low, int high, HashMap<String, Boolean> memo){
        String memoizeKey = createMemoizeKey(low, high);
        if(memo.containsKey(memoizeKey)){
            return memo.get(memoizeKey);
        }

        //base case

        if(low <=0 && high <=0){
            return false;
        }
        boolean canMeasure = false;

        return true;
    }

    public static String createMemoizeKey(int low, int high){
     return low + ":" + high;
    }

    public static void main(String[] args) {
        int[][] measuringCups = {{200, 210},
        {450, 465},
        {800, 850}};
        int low = 2100;
        int high = 2300;

        System.out.println("These measuring cups can be measured ? " + ambiguousMeasurements(measuringCups, low, high));
    }
}
