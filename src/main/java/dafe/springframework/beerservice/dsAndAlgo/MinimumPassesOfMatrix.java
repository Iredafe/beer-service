package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class MinimumPassesOfMatrix {

    public static int minimumPassesOfMatrix(int [][] matrix){
        int passes = convertNegatives(matrix);
        return (!containsNegative(matrix) ? passes-1 : -1);
    }

    public static int convertNegatives(int [][]matrix){
        ArrayList<int[]> nextPassQueue = getAllPositivePositions(matrix);
        int passes = 0;
        while(nextPassQueue.size() > 0){
            ArrayList<int[]> currentPassQueue = nextPassQueue;
            nextPassQueue = new ArrayList<>();

         while (currentPassQueue.size() > 0){
                int [] vals = currentPassQueue.remove(0);
                int currentRow = vals[0];
                int currentCol = vals[1];

                ArrayList<int[]> adjacentPositions = getAdjacentPositions(currentRow, currentCol, matrix);

                for(int [] position : adjacentPositions){
                        int row = position[0];
                        int col = position[1];

                        int value = matrix[row][col];
                        if(value < 0){
                            matrix[row][col] *= -1;
                            nextPassQueue.add(new int[]{row, col});
                        }
                }
         }
                passes+=1;
        }
        return passes;
    }

    public static ArrayList<int[]> getAllPositivePositions( int[][] matrix){
        ArrayList<int[]> positivePositions = new ArrayList<>();
        for(int row=0; row < matrix.length; row++){
            for(int col=0; col < matrix[0].length; col++){
                int value = matrix[row][col];
                if(value > 0){
                    positivePositions.add(new int[]{row,col});
                }
            }
        }
        return positivePositions;
    }

    public static ArrayList<int[]> getAdjacentPositions(int row, int col, int[][]matrix){
        ArrayList<int []> adjacentPositions = new ArrayList<>();
        if(row>0) adjacentPositions.add(new int[] {row-1, col});
        if(row < matrix.length-1) adjacentPositions.add(new int[]{row+1, col});
        if(col>0) adjacentPositions.add(new int[]{row, col-1});
        if(col<matrix[0].length-1) adjacentPositions.add(new int[] {row, col+1});
        return adjacentPositions;
    }

    public static boolean containsNegative(int [][] matrix){
        for(int row=0; row < matrix.length; row++){
            for(int col=0; col < matrix[0].length; col++){
                int value = matrix[row][col];
                if(value < 0) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] matrix =   {{0, -1, -3, 2, 0},
                            {1, -2, -5, -1, -3},
                            {3, 0, 0, -4, -1}};
        System.out.println("This is the minimum passes of the given matrix : " + minimumPassesOfMatrix(matrix));
    }
}
