package dafe.springframework.beerservice.Grokking;

public class NumberOfIslands {

    private static int countIslands(int [][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int totalIslands = 0;
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                if (grid[row][col] == 1) {
                    visitIslands(grid, row, col);
                    totalIslands++;
                }
            }
        }
        return totalIslands;
    }
        private static void visitIslands(int [][] matrix, int row, int col){
            if(row<0||row>= matrix.length||col<0||col>= matrix[0].length) return;
            if(matrix[row][col] == 0) return;
            matrix[row][col]=0;
            visitIslands(matrix, row+1, col);
            visitIslands(matrix, row-1,col);
            visitIslands(matrix, row, col-1);
            visitIslands(matrix, row, col+1);
        }

    public static void main(String[] args) {
        System.out.println(" The total number Islands in the grid is " +countIslands(
                new int[][] {
                        { 0, 1, 1, 1, 0 },
                        { 0, 0, 0, 1, 1 },
                        { 0, 1, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0 }
                }));
        System.out.println( "The total number Islands in the grid is " +countIslands(
                new int[][] {
                        { 1, 1, 1, 0, 0 },
                        { 0, 1, 0, 0, 1 },
                        { 0, 0, 1, 1, 0 },
                        { 0, 0, 1, 0, 0 },
                        { 0, 0, 1, 0, 0 }
                }));
    }
    }

