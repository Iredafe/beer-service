package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.Integer.compare;

public class MergeIntervals {

    public static int[][] merge(int[][] arrays) {

        int[][] sortedInput = arrays.clone();
        Arrays.sort(sortedInput, (a,b)->compare(a[0], b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = sortedInput[0];
        mergedIntervals.add(currentInterval);

        for (int[] nextInterval : sortedInput) {
            int currentIntervalEnd = currentInterval[1];
            int nextIntervalStart = nextInterval[0];
            int nextIntervalEnd = nextInterval[1];

            if (currentIntervalEnd >= nextIntervalStart) {
                currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
            }else{
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
    public static void main(String[] args) {

        int[][] input = { {1, 2},
        {3, 5},
        {4, 7},
        {6, 8},
        {9, 10}};
        System.out.println("These are the overlapping intervals : " + Arrays.toString(merge(input)));
    }
}
