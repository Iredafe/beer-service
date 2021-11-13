package dafe.springframework.beerservice.dsAndAlgo;

public class BinarySearch {

    public static int binarySearch(int [] array , int target){

        return -1;
    }


    public static void main(String[] args) {
        int [] input = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;

        System.out.println("This is the index for the number you searched for " + binarySearch(input, target));
    }
}
