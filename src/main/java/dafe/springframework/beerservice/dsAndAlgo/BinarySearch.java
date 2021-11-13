package dafe.springframework.beerservice.dsAndAlgo;

public class BinarySearch {

    public static int binarySearch(int [] array , int target){

      return binarySearchHelper(array, target, 0, array.length-1);
    }

    //O(log(n)) time and O(1) space
    private static int binarySearchHelper(int[] array, int target, int left, int right) {
        while(left<=right){
            int mid=(right+left)/2;
            int searchResult = array[mid];
            if(target==searchResult){
                return mid;
                //if the target number is greater than the search result, cut away the left of the array
                // because we now know the target should be on the right
            }else if(target>searchResult){
                left= mid+1;
            //if the target number is less than the search result, cut away the right of the array
                //because we now know that the target should be on the left of the array
            }else {
                right=mid-1;
            }
        }
        return -1;
    }

    //O(log(n)) time and O(log(n)) space
     public static int binarySearchRecursive(int[] array, int target){

        return binarySearchRecursiveHelper(array, target, 0, array.length-1);
    }

    public static int binarySearchRecursiveHelper(int [] array, int target, int left, int right){
        while(left<=right){
            int middle = (left+right)/2;
            int searchResult = array[middle];
            if(target==searchResult) return middle;
            else if(target < searchResult){
                return binarySearchRecursiveHelper(array,target, left, middle-1);
            }else if(target>searchResult){
                return binarySearchRecursiveHelper(array,target,middle+1,right);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] input = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;

        System.out.println("The index for the number you searched for is : " + binarySearch(input, target));
        System.out.println("The index for the number you searched for is : " + binarySearchRecursive(input, target));
    }
}
