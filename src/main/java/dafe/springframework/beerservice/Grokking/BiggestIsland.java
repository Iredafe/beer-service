package dafe.springframework.beerservice.Grokking;

public class BiggestIsland {


    public static void main(String[] args) {
        System.out.println(maxAreaOfIsland(
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
}
