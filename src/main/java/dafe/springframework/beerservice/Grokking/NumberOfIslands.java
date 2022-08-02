package dafe.springframework.beerservice.Grokking;

public class NumberOfIslands {

    private static int countIslands(int [][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;

        for(int row=0; row<rowLength; row++) {
            for (int col = 0; col < colLength; col++) {

            }
        }
        return 0;
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
}
