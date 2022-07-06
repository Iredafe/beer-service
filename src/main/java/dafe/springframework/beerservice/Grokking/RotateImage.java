package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;

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

    public static void reverse(int [][]matrix){
        for(int i=0; i<matrix.length; i++){
            int start = 0; int end = matrix.length-1;

            while(start<=end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int [][] image = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("This is the rotated image : " + Arrays.deepToString(rotataImage(image)));
    }
}
