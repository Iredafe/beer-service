package dafe.springframework.beerservice.OnsitePrep;

public class RotateImage {

    public static int[][] rotataImage(int [][] matrix){

        transpose(matrix);
        reverse(matrix);

        return matrix;
    }
}
