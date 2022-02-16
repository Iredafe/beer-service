package dafe.springframework.beerservice.dsAndAlgo;

public class FirstElementNotSmallerThanTarget {

    public static int firstElementNotSmallerThanTarget(int [] arr, int target){
        int left = 0;
        int right = arr.length-1;
        return -1;
    }

    public static void main(String[] args) {
        int input[] = {2, 3, 5, 7, 11, 13, 17, 19};
        int target = 6;
        System.out.println("This is the first element index : " + firstElementNotSmallerThanTarget(input, target));
    }
}
