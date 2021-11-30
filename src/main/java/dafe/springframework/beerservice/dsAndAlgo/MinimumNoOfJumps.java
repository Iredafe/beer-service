package dafe.springframework.beerservice.dsAndAlgo;

public class MinimumNoOfJumps {

    public static int minimumNoOfJumps(int [] array){

        return 1;
    }

    public static void main(String[] args) {
        int [] input ={3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3};

        System.out.println("This is the minimum number of jumps : " + minimumNoOfJumps(input));
    }
}
