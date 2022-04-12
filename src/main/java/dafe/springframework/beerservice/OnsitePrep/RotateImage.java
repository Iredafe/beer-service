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

            }
        }
    }
}
