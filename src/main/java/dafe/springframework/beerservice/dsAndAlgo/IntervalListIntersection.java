package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersection {

    private static int[][] findIntersection(int[][] first, int[][] second) {
        List<int[]> result = new ArrayList<>();

        return result.toArray(new int[result.size()][]);
    }



    public static void main(String[] args) {
        int[][] first = {{0,2},{5,10},{13,23},{24,25}};
        int[][] second = {{1,5},{8,12},{15,24},{25,26}};

        System.out.println("This is the intersection : " + findIntersection(first, second));
    }

}
