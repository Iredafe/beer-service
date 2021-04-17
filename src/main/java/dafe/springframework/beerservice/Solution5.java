package dafe.springframework.beerservice;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {

    public static List<Integer> luckyNumbers(int[][] matrix) {
        //problem statement:
        /*
        lucky number is the minimum element in its row(x axis m=mat.length) and maximum in its column(y axis n=mat[i].length)
        [3, 7, 8]
        [9, 11, 13]
        [15, 16,17]
        x1 = [[i=0,j=0]=3, [i=0,j=1]=7, [i=0,j=2]=8,
        x2 =[[i=1, j=0]=9, [i=1, j=1]=11, [i=1, j=2]=13,
        x3 =[[i=2, j=0]=15, [i=2,j=1]=16, [i=2,j=2]=17]
        i=0, j=0
        OR

        [7, 8]
        [1, 2]

        */
        //all elements in the matrix are distinct
        //the input is a 2-dimensional arrray
        //find the MINIMUM number in the row that is also the maximum number in the COLUMN

        //solution statement:
        //initialize two pointers
        List<Integer> myList = new ArrayList<>();
        //compare one number and check if it is less than other numbers in the row(x axis)
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE, minIndex = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                //if it is not less than all the numbers on the row, move to the next on that axis
                //if it is the minimum in the row, check the column to see if it is the maximum
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean valid = true;

            for (int j = 0; j < matrix.length; j++) {
                //if it is not the maximum, break out and go to the next index in the row
                //if it is also the maximum, return the number in that index.
                if (matrix[j][minIndex] > min) {
                    valid = !valid;
                    break;
                }
            }
            if (valid)
                myList.add(min);
        }
        return myList;
    }

    public static void main(String[] args) {
        int[][] test = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println("This is the lucky number in the matrix : " + luckyNumbers(test));
    }
    }


