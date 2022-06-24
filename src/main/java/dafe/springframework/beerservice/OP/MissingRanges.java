package dafe.springframework.beerservice.OP;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    private static List<String> findMissingRanges(int [] input, int lower, int upper){
        List<String> result = new ArrayList<>();
        int previous = lower - 1;

        for(int i=0; i<=input.length; i++){
            int current = (i < input.length)? input[i] : upper+1;
            if(previous+1 <= current-1){
                result.add(formatRange(previous+1, current-1));
            }
            previous = current;
        }
        return result;
    }

    private static String formatRange(int lower, int upper){
        if(lower == upper){
            return String.valueOf(lower);
        }
        return lower + "->" + upper;
    }

    public static void main(String[] args) {
        int [] array = {0,1,3,50,75};
        int upper = 99;
        int lower = 0;
        System.out.println("These are the missing ranges : " + findMissingRanges(array, lower, upper));
    }
}
