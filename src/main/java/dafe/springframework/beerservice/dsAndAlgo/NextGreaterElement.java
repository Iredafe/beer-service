package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int [] array){

        int [] result = new int[array.length];
        Arrays.fill(result, -1);

        return result;
    }


    public static void main(String[] args) {
        int input [] = {2, 5, -3, -4, 6, 7, 2};

        System.out.println
                ("This is the result of nex greater element function : "
                        + nextGreaterElement(input));
    }
}
