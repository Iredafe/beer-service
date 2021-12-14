package dafe.springframework.beerservice.dsAndAlgo;

public class SearchForRange {
    public static int[] searchRange(int[] array, int target){

        int result[] = {-1,-1};
        searchRangeHelper(array, target, 0, array.length-1, result);
        return result;
    }

    public static void searchRangeHelper(int[] array, int target, int left, int right, int [] result){


    }
}
