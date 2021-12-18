package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        int [][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> mergedIntervals = new ArrayList<>();
        int [] currentInterval = sortedIntervals[0];

        for(int[] nextInterval:sortedIntervals){
           int nextIntervalEnd = nextInterval[1];
            int nextIntervalStart = nextInterval[0];
            int currentIntervalEnd = currentInterval[1];

            if(currentIntervalEnd >= nextIntervalStart){
                currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
            }else {
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
        System.out.println("These are the overlapping intervals : " + Arrays.deepToString(merge(input)));
    }
}
//initialize a sortedIntervals array
//clone the input and store in sortedIntervals
//sort the 2d array with a comparator
//create a mergedInterval object to store the output
//assign the first array in the sortedInterval array to currentInterval variable
//add the currentInterval into the mergedInterval arraylist
//loop through the sorted intervals - for each nextInterval in sortedIntervals
//do a check - if the last index of the currentInterval is >= nextInterval
//assign the last index - currentInterval[1] to the Max value of currentInterval[1] and nextInterval[1]
//if not, assign the currentInterval array to nextInterval array
//append the currentInterval into the output object