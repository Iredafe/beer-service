package dafe.springframework.beerservice.dsAndAlgo;

public class ShiftedBinarySearch {
    public static int shiftedBinarySearch(int [] array, int target){
    int left = 0; int right = array.length-1;
    int middle = (left+right)/2;

    while (left<right){
        if(array[middle] == target) return middle;
        if(array[middle] != target && array[left] <= target){
            right = middle - 1;
        }else if(array[middle] != target && array[right] >= target){
            left = middle +1;
        }
    }
        return 0;
    }


    public static void main(String[] args) {
        int[] input ={45, 61, 71, 72, 73, 0, 1, 21, 33, 37};
        int searchTerm = 33;

        System.out.println("This is the index of the target integer : " + shiftedBinarySearch(input,searchTerm));
    }
}
