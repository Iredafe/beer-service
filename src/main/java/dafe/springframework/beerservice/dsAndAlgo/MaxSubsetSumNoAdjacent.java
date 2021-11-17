package dafe.springframework.beerservice.dsAndAlgo;

public class MaxSubsetSumNoAdjacent {

    public static int maxSubsetSumNoAdjacent(int[] array){

        if(array.length==0) return 0;

        return 1;
    }

    public static void main(String[] args) {

        int [] input = {75, 105, 120, 75, 90, 135};

        System.out.println("This is the maximum + " + maxSubsetSumNoAdjacent(input));
    }
}
