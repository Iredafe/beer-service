package dafe.springframework.beerservice.OnsitePrep;

public class RotateImage {

    public static int[][] rotataImage(int [][] matrix){

        transpose(matrix);
        reverse(matrix);

        return matrix;
    }

    public static void transpose(int [][] matrix){
        for(int i=0; i< matrix.length; i++){
            for(int j=i; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
