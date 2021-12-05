package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static List<List<Integer>> permutation(List<Integer> array){

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);

        System.out.println("These are the permutations : " + permutation(array));
    }
}
