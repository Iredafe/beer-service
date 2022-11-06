package dafe.springframework.beerservice.Grokking;

public class NumberOfClosedIsland {

    static int rowLength;
    static int colLength;

    private static int countClosedIslands(int[][] matrix){
        rowLength =matrix.length;
        colLength = matrix[0].length;
        int numberOfClosedIsland = 0;
        boolean[][]visited = new boolean[][]{};


        for(int row = 0; row< rowLength; row++){
            for (int col = 0; col< colLength; col++){
                if(matrix[row][col] == 1 && !visited[row][col]){
                    if(isClosedIsland(matrix, row, col, visited));
                    numberOfClosedIsland++;
                }
            }
        }

        return numberOfClosedIsland;
    }

    private static boolean isClosedIsland(int [][] matrix, int row, int col, boolean [][]visited){
        if (row<0 || row >= rowLength || col < 0 || col >= colLength)
            return false;

            visited[row][col]=true;
            isClosedIsland(matrix,row+1,col,visited);
            isClosedIsland(matrix,row-1,col,visited);
            isClosedIsland(matrix,row,col+1,visited);
            isClosedIsland(matrix,row,col-1,visited);
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
