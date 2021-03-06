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

        if(arrayOne.get(rootIdxOne) == arrayTwo.get(rootIdxTwo)) return false;
        if(rootIdxOne == -1 || rootIdxTwo==-1) return rootIdxOne == rootIdxTwo;
        int currentValue = arrayOne.get(rootIdxOne).intValue();
        int leftRootIdxOne = getSmallerRootIdx(arrayOne, rootIdxOne, minValue);
        int leftRootIdxTwo = getSmallerRootIdx(arrayTwo, rootIdxTwo, minValue);
        int rightRootIdxOne = getBiggerOrEqual(arrayOne, rootIdxOne, maxValue);
        int rightRootIdxTwo = getBiggerOrEqual(arrayTwo, rootIdxTwo, maxValue);

        boolean leftAreSame = areSameBSTs(arrayOne, arrayTwo, leftRootIdxOne, leftRootIdxTwo,minValue, currentValue);
        boolean rightAreSame = areSameBSTs(arrayOne,arrayTwo, rightRootIdxOne, rightRootIdxTwo,currentValue, maxValue);

        return leftAreSame && rightAreSame;
    }

    private static int getSmallerRootIdx(List<Integer> array, int startIdx, int minValue) {
        for(int i= startIdx+1; i< array.size(); i++){
            if(array.get(i).intValue() < array.get(startIdx).intValue()
            && array.get(i).intValue() >= minValue) return i;
        }
        return -1;
    }

    private static int getBiggerOrEqual(List<Integer> array, int maxValue, int startIdx) {
        for(int j=startIdx+1; j<array.size(); j++){
            if(array.get(j).intValue() >= array.get(startIdx).intValue()
            && array.get(j).intValue() < maxValue) return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(10,15,8,12,94,81,5,2,11);
        List<Integer> second = Arrays.asList(10,8,5,15,2,12,11,94,81);

        System.out.println("Are they same BSTs ? : " + isSameBsts(first,second));
    }
}
