package dafe.springframework.beerservice.Grokking;

public class NumberOfClosedIsland {

    private static int countClosedIslands(int[][] matrix){

        int numberOfClosedIsland = 0;

        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        for(int row = 0; row< rowLength; row++){
            for (int col = 0; col< colLength; col++){
                if(matrix[row][col] == 1){
                    dfs(matrix, row, col);
                }
            }
        }

        return numberOfClosedIsland;
    }

    private static void dfs(int [][] matrix, int row, int col){

    }

    public static void main(String[] args) {
        System.out.println(countClosedIslands(
                new int[][] {
                        { 1, 1, 0, 0, 0 },
                        { 0, 1, 0, 0, 0 },
                        { 0, 0, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0 }
                }));

        System.out.println(countClosedIslands(
                new int[][] {
                        { 0, 0, 0, 0 },
                        { 0, 1, 0, 0 },
                        { 0, 1, 0, 0 },
                        { 0, 0, 1, 0 },
                        { 0, 0, 0, 0 }
                }));
    }
}
