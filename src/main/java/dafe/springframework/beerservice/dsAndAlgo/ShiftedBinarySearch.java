package dafe.springframework.beerservice.dsAndAlgo;

public class ShiftedBinarySearch {
    public static int shiftedBinarySearch(int [] array, int target){
    int left = 0; int right = array.length-1;

    while (left<=right){
        int middle = (left+right)/2;
        int potentialMatch = array[middle];
        if(potentialMatch == target) return middle;
        if(array[left] <= potentialMatch) {
            if (potentialMatch > target && array[left] <= target) {
                right = middle - 1;
            } else  {
                left = middle + 1;
            }
        }else{
            if(potentialMatch < target && array[right] >= target){
                left = middle+ 1;
            }else {
                right = middle-1;
            }
        }
    }
        return -1;
    }


    public static void main(String[] args) {
        int[] input ={45, 61, 71, 72, 73, 0, 1, 21, 33, 37};
        int searchTerm = 33;

        System.out.println("This is the index of the target integer : " + shiftedBinarySearch(input,searchTerm));
    }
}
