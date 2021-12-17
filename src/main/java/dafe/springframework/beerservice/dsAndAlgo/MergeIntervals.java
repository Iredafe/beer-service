package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.Integer.compare;

public class MergeIntervals {

    public static int[][] merge(int[][] arrays) {


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