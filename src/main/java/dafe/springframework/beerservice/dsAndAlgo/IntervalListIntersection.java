package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersection {

    private static int[][] findIntersection(int[][] first, int[][] second) {
        List<int[]> result = new ArrayList<>();
        int i=0;int j=0;
        while(i < first.length && j < second.length){

            int low= Math.max(first[i][0], second[j][0]);
            int high= Math.min(first[i][1], second[j][1]);

            if(low <= high) {
                result.add(new int[]{low, high});
            }
            if(first[i][1] < second[j][1]){
                i++;
            }else j++;

            }
        return result.toArray(new int[result.size()][]);
    }



    public static void main(String[] args) {
        int[][] first = {{0,2},{5,10},{13,23},{24,25}};
        int[][] second = {{1,5},{8,12},{15,24},{25,26}};

        System.out.println("This is the intersection : " + Arrays.deepToString(findIntersection(first, second)));
        int[][] second2= {};
//        int[][] first1={{1,3},{5,9}};
//        System.out.println("This is the intersection 2: " + Arrays.deepToString(findIntersection(first1, second2)));
    }

}
