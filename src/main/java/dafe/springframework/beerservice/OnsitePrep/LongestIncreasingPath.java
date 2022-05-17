package dafe.springframework.beerservice.OnsitePrep;

public class LongestIncreasingPath {

    private static int longestIncreasingPath(int[][] matrix){
        int [][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int [][] cache = new int [rowLength][colLength];


        return 0;
    }

    public static void main(String[] args) {
        int [][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
        System.out.println("The longest increasing path is : " + longestIncreasingPath(matrix));
    }
}
