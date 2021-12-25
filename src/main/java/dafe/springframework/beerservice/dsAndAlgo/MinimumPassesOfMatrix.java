package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class MinimumPassesOfMatrix {

    public static int minimumPassesOfMatrix(int [][] matrix){
        int passes = convertNegatives(matrix);
        return passes;
    }

    public static int convertNegatives(int [][]matrix){

        return 1;
    }

    public static ArrayList<int[]> getAdjacentPositions(int row, int col, int[][]matrix){

        return new ArrayList<>();
    }

    public static ArrayList<int[]> getAllPositivePositions(int row, int col, int[][] matrix){

        return new ArrayList<>();
    }

    public static boolean containsNegative(int [][] matrix){

        return false;
    }

    public static void main(String[] args) {
        int [][] matrix =   {{0, -1, -3, 2, 0},
                            {1, -2, -5, -1, -3},
                            {3, 0, 0, -4, -1}};
        System.out.println("This is the minimum passes of the given matrix : " + minimumPassesOfMatrix(matrix));
    }
}
