package dafe.springframework.beerservice.dsAndAlgo;

public class NonConstructibleChange {

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        return -1;
    }

    public static void main(String[] args) {
        int[] input ={5, 7, 1, 1, 2, 3, 22};

        System.out.println("The minimum change is : " + nonConstructibleChange(input));
    }
}
