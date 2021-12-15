package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortStack {

    public static List<Integer> sortStack(List<Integer> stack){

        return new ArrayList<>();
    }


    public static void main(String[] args) {
         List<Integer> stack = new ArrayList<>(Arrays.asList(-5, 2, -2, 4, 3, 1));

        System.out.println("This is the sorted stack : " + sortStack(stack));
    }
}
