package dafe.springframework.beerservice.Grokking;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    private static int countIslands(int [][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int totalIslands = 0;
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                if (grid[row][col] == 1) {
                    visitIslandsDFS(grid, row, col);
                    totalIslands++;
                }
            }
        }
        return totalIslands;
    }
        private static void visitIslandsDFS(int [][] matrix, int row, int col){
            if(row<0||row>= matrix.length||col<0||col>= matrix[0].length) return;
            if(matrix[row][col] == 0) return;
            matrix[row][col]=0;
            visitIslandsDFS(matrix, row+1, col);
            visitIslandsDFS(matrix, row-1,col);
            visitIslandsDFS(matrix, row, col-1);
            visitIslandsDFS(matrix, row, col+1);
        }


        private static int getNumberOfIslands(int [][] matrix){
        int numberOfIslands=0;
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    visitIslandsBFS(matrix, i, j);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
        }

        private static void visitIslandsBFS(int [][] matrix, int row, int col){

            Queue<int []> queue = new LinkedList<>();
            queue.add((new int[]{row,col}));

            while (!queue.isEmpty()){
                int [] neighbor = queue.poll();
                int newRow = neighbor[0];
                int newCol = neighbor[1];
                if(newRow<0 || newRow>= matrix.length || newCol <0 || newCol>=matrix[0].length) continue;
                if(matrix[newRow][newCol] == 0) continue;
                matrix[newRow][newCol]=0;
                queue.add(new int[]{newRow+1, newCol});
                queue.add(new int[]{newRow-1, newCol});
                queue.add(new int[]{newRow, newCol-1});
                queue.add(new int[]{newRow, newCol+1});
            }
        }
    public static void main(String[] args) {
        System.out.println(" The total number Islands in the dfs grid is " +countIslands(
                new int[][] {
                        { 0, 1, 1, 1, 0 },
                        { 0, 0, 0, 1, 1 },
                        { 0, 1, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0 }
                }));
        System.out.println( "The total number Islands in the dfs grid is " +countIslands(
                new int[][] {
                        { 1, 1, 1, 0, 0 },
                        { 0, 1, 0, 0, 1 },
                        { 0, 0, 1, 1, 0 },
                        { 0, 0, 1, 0, 0 },
                        { 0, 0, 1, 0, 0 }
                }));
    System.out.println(" The total number Islands in the bfs grid is " +getNumberOfIslands(
                new int[][] {
                        { 0, 1, 1, 1, 0 },
                        { 0, 0, 0, 1, 1 },
                        { 0, 1, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0 }
                }));
        System.out.println( "The total number Islands in the bfs grid is " +getNumberOfIslands(
                new int[][] {
                        { 1, 1, 1, 0, 0 },
                        { 0, 1, 0, 0, 1 },
                        { 0, 0, 1, 1, 0 },
                        { 0, 0, 1, 0, 0 },
                        { 0, 0, 1, 0, 0 }
                }));
    }
    }

