package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.List;

public class SameBST {
    public static boolean isSameBsts(List<Integer> arrayOne, List<Integer> arrayTwo){
        return areSameBSTs(arrayOne, arrayTwo, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean areSameBSTs(List<Integer> arrayOne,
                                       List<Integer> arrayTwo,
                                       int rootIdxOne,
                                       int rootIdxTwo,
                                       int minValue,
                                       int maxValue) {


        int leftRootIdxOne = getSmallerRootIdx(arrayOne, rootIdxOne, minValue);
        int leftRootIdxTwo = getSmallerRootIdx(arrayTwo, rootIdxTwo, minValue);
        int rightRootIdxOne = getBiggerOrEqual(arrayOne, maxValue, rootIdxOne);
        int rightRootIdxTwo = getBiggerOrEqual(arrayTwo, maxValue, rootIdxTwo);


        return true;
    }

    private static int getSmallerRootIdx(List<Integer> arrayTwo, int rootIdxTwo, int minValue) {
        return 0;
    }

    private static int getBiggerOrEqual(List<Integer> arrayTwo, int maxValue, int rootIdxTwo) {

        return 1;
    }

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(10,15,8,12,94,81,5,2,11);
        List<Integer> second = Arrays.asList(10,8,5,15,2,12,11,94,81);

        System.out.println("Are they same BSTs ? : " + isSameBsts(first,second));
    }
}
