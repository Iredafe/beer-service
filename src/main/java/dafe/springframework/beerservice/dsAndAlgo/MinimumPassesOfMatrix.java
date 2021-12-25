package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class MinimumPassesOfMatrix {

    public static int minimumPassesOfMatrix(int [][] matrix){

        return 0;
    }

    public static ArrayList<int[]> getAdjacentPositions(int row, int col, int[][]matrix){

        return new ArrayList<>();
    }
    public static void main(String[] args) {
        int [][] matrix =   {{0, -1, -3, 2, 0},
                            {1, -2, -5, -1, -3},
                            {3, 0, 0, -4, -1}};
        System.out.println("This is the minimum passes of the given matrix : " + minimumPassesOfMatrix(matrix));
    }
}
