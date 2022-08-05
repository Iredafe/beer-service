package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;


public class FloodFill {

    private static int[][] floodFill(int [][] matrix, int i, int j, int newColor){
        if(matrix[i][j]!= newColor){
            fillDFS(matrix, i, j, matrix[i][j], newColor);
        }
        return matrix;
    }

    private static void fillDFS(int [][] matrix, int i, int j, int oldColor, int newColor){

        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length){
            return;
        }
        if(matrix[i][j] != oldColor) return;
        matrix[i][j]=newColor;

        fillDFS(matrix, i+1, j,oldColor, newColor);
        fillDFS(matrix, i-1, j,oldColor, newColor);
        fillDFS(matrix, i, j+1,oldColor, newColor);
        fillDFS(matrix, i, j-1,oldColor, newColor);

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(floodFill(
                new int[][] {
                        { 0, 1, 1, 1, 0 },
                        { 0, 0, 0, 1, 1 },
                        { 0, 1, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0 }
                }, 1, 3, 2)));

        System.out.println(Arrays.deepToString(floodFill(
                new int[][] {
                        { 0, 1, 1, 1, 0 },
                        { 0, 0, 0, 1, 1 },
                        { 0, 1, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0 }
                }, 1, 3, 2)));

        System.out.println("This is the new array " +Arrays.deepToString(floodFill(
                new int[][] {
                        { 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0 },
                        { 0, 0, 1, 1, 0 },
                        { 0, 0, 1, 0, 0 },
                        { 0, 0, 1, 0, 0 }
                }, 3, 2, 5)));
    }
}
