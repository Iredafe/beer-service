package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RiverSizes {

    public static List<Integer> riverSizes(int[][] matrix) {

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0}
        };

        System.out.println("These are the river sizes : " + riverSizes(matrix));
    }
}