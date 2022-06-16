package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.List;

public class TopKNumbers {


    private static List<Integer> findKLargestNumbers(int[] ints, int n) {

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<Integer> result =
                findKLargestNumbers(new int[] { 3, 1, 5, 12, 2, 11 }, 3);
        System.out.println("Here are the top K numbers: " + result);

        result = findKLargestNumbers(new int[] { 5, 12, 11, -1, 12 }, 3);
        System.out.println("Here are the top K numbers: " + result);
    }

}
