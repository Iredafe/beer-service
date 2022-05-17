package dafe.springframework.beerservice.OnsitePrep;

public class LongestIncreasingPath {
   private static int [][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};

    private static int longestIncreasingPath(int[][] matrix){
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        if(rowLength==0) return 0;
        int [][] cache = new int [rowLength][colLength];
        int answer = 0;

        for(int i=0; i<rowLength; i++){
            for(int j=0; j<colLength; j++){
                answer = Math.max(answer, dfs(matrix, i, j, cache));
            }
        }
        return answer;
    }

    private static int dfs(int [][]matrix, int i, int j, int[][] cache){
        int rowLength = matrix.length;
        int colLength= matrix[0].length;


        for(int [] direction : directions){
            int row = i + direction[0];
            int col = j + direction[1];
            if(row>=0 && col >=0 && row < rowLength && col < colLength && matrix[row][col] > matrix[i][j]){
                cache[row][col] = Math.max(cache[i][j], dfs(matrix,row,col,cache));
            }
        }
        return cache[i][j];
        }

    public static void main(String[] args) {
        int [][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
        System.out.println("The longest increasing path is : " + longestIncreasingPath(matrix));
    }
}
