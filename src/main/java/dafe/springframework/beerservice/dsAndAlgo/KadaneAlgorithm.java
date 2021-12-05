package dafe.springframework.beerservice.dsAndAlgo;

public class KadaneAlgorithm {

    public static  int kadane(int[] array){

    int maxEndingHere = array[0];
    int maxSoFar = array[0];

    for(int i=1; i< array.length; i++){

        int num = array[i];
        maxEndingHere = Math.max(maxEndingHere+num, num);
        maxSoFar = Math.max(maxEndingHere, maxSoFar);
    }
        return maxSoFar;
    }


    public static void main(String[] args) {

        int[] input = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};

        System.out.println("This is the maximum number : " + kadane(input));
    }
}
