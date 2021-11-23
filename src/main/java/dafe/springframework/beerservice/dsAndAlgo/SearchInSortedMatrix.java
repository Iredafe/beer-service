package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;

public class SearchInSortedMatrix {

    public static int[] searchSortedMatrix(int[][] matrix, int target){
    int row =0, column = matrix[0].length-1;
        while(row<matrix[0].length && column>= 0){

            if(matrix[row][column] > target) column--;
            else if(matrix[row][column] < target) row++;
            else return new int[]{row, column};
        }
        return new int[]{-1,-1};
    }



    public static void main(String[] args) {
        int target=1;
        int[][] matrix = {
                {1, 4, 7, 12, 15, 1000},
        {2, 5, 19, 31, 32, 1001},
        {3, 8, 24, 33, 35, 1002},
        {40, 41, 42, 44, 45, 1003},
        {99, 100, 103, 106, 128, 1004}
        };

        int [] result = searchSortedMatrix(matrix,target);
        System.out.println("This  is the position of the target : " + Arrays.toString(result));

    }
}