package dafe.springframework.beerservice.Grokking;

public class BiggestIsland {


    public static void main(String[] args) {
        System.out.println("This is the biggest island " + maxAreaOfIsland(
                new int[][] {
                        { 1, 1, 1, 0, 0 },
                        { 0, 1, 0, 0, 1 },
                        { 0, 0, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 1, 0, 0 }
                }));
    }

    private static int maxAreaOfIsland(int[][] matrix) {
        int biggestIsland=0;
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==1){
                    biggestIsland=Math.max(biggestIsland, visitIslandDFS(matrix, i,j));
                }
            }
        }
        return biggestIsland;
    }

    private static int visitIslandDFS(int [][] matrix, int row, int col){
        int area=1;
        if(row<0|| row>=matrix.length || col <0 || col >=matrix[0].length){
            return 0;
        }
        if(matrix[row][col] == 0) return 0;

        matrix[row][col] =0;
        area+=visitIslandDFS(matrix, row+1, col);
        area+=visitIslandDFS(matrix,row-1,col);
        area+=visitIslandDFS(matrix,row, col+1);
        area+=visitIslandDFS(matrix, row, col-1);

        return area;
    }
}
