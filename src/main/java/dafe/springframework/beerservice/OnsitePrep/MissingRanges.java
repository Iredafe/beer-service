package dafe.springframework.beerservice.OnsitePrep;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    private static List<String> findMissingRanges(int [] input){
        List<String> result = new ArrayList<>();

        return result;
    }

    private String formatRange(int lower, int upper){
        if(lower == upper){
            return String.valueOf(lower);
        }
        return lower + "->" + upper;
    }

    public static void main(String[] args) {
        int [] array = {0,1,3,50,75};
        System.out.println("These are the missing ranges : " + findMissingRanges(array));
    }
}
