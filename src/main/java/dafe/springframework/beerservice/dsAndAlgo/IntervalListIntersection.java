package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersection {

    private static int[][] findIntersection(int[][] first, int[][] second) {
        List<int[]> result = new ArrayList<>();
        int i=0;int j=0;
        while(i < first.length && j < second.length){

            int low= Math.max(first[i][0], second[j][0]);
            int high= Math.max(first[i][1], second[j][1]);

            if(low <= high){
                result.add(new int[]{low, high});

            if(first[i][1] < second[j][i]){
                i++;
            }else j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }



    public static void main(String[] args) {
        int[][] first = {{0,2},{5,10},{13,23},{24,25}};
        int[][] second = {{1,5},{8,12},{15,24},{25,26}};

        System.out.println("This is the intersection : " + findIntersection(first, second));
    }

}
