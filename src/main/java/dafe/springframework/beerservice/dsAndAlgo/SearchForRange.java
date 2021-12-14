package dafe.springframework.beerservice.dsAndAlgo;

public class SearchForRange {
    public static int[] searchRange(int[] array, int target){

        int result[] = {-1,-1};
        searchRangeHelper(array, target, 0, array.length-1, result, true);
        searchRangeHelper(array, target, 0, array.length-1, result, false);
        return result;
    }

    public static void searchRangeHelper(int[] array, int target, int left, int right, int [] result, boolean goLeft){
        if(left > right) return;

        int mid = (left+right)/2;

        if(array[mid] < target){
            searchRangeHelper(array, target, left, mid-1, result, goLeft);
        }else if (array[mid] > target){
            searchRangeHelper(array,target,mid+1, right, result, goLeft);
        }else{
            if(goLeft){
                if (mid==0 || array[mid-1] != target){
                    result[0]=mid;
                }else{
                     searchRangeHelper(array,target,left, mid-1, result,goLeft);
                }
            }else{
                if(mid== array.length-1 || array[mid+1] != target){
                    result[1] = mid;
                }
            }
        }

    }
}
