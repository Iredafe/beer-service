package dafe.springframework.beerservice.Grokking;

public class NumberOfClosedIsland {
    private static int countClosedIslands(int[][] matrix){
        int numberOfClosedIsland = 0;
        boolean[][]visited = new boolean[matrix.length][matrix[0].length];

        for(int row = 0; row< matrix.length; row++){
            for (int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] == 1 && !visited[row][col]){
                    if(isClosedIsland(matrix, row, col, visited))
                    numberOfClosedIsland++;
                }
            }
        }
        return numberOfClosedIsland;
    }

    private static boolean isClosedIsland(int [][] matrix, int x, int y, boolean [][]isVisited){
        if (x<0 || x >= matrix.length || y < 0 || y >= matrix[0].length) return false;
        if(matrix[x][y] == 0 || isVisited[x][y]) return true;
            isVisited[x][y]=true;
            Boolean isClosed = true;
        isClosed &= isClosedIsland(matrix,x+1,y,isVisited);
        isClosed &= isClosedIsland(matrix,x-1,y,isVisited);
        isClosed &= isClosedIsland(matrix,x,y +1,isVisited);
        isClosed &= isClosedIsland(matrix,x,y -1,isVisited);
            return isClosed;
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
