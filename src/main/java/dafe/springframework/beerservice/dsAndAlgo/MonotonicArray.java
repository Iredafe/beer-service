package dafe.springframework.beerservice.dsAndAlgo;

public class MonotonicArray {

    public static boolean isMonotonicArray(int [] array){


        return true;
    }


    public static void main(String[] args) {

        int[] input = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};

        System.out.println("This array is monotonic : " + isMonotonicArray(input));
    }
}
