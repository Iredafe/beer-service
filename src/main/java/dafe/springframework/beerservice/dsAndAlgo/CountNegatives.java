package dafe.springframework.beerservice.dsAndAlgo;

/*
Given a m x n matrix grid which is sorted in non-increasing order
both row-wise and column-wise, return the number of negative numbers in grid.
 */

public class CountNegatives {


public static int countNegatives(int[][] grid){

    int count =0;
    for(int i=0; i<grid.length; i++){
        for(int j=0; j<grid[i].length; j++){
            if(grid[i][j] < 0)
                count++;
        }
    }

    return count;
}

public static int countNegativesInMatrix(int [][] grid){

    int counter = 0;
    for(int i=0; i<grid.length; i++){
        int start =0, end = grid[i].length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(grid[i][mid]<0){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        counter = counter + grid[i].length - start;
        end = start -1;
    }

    return counter;
}

    public static void main(String[] args) {

    int[][] test1= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        System.out.println("This is the counter of negatives in the sorted matrix : " + countNegatives(test1));
        System.out.println("This is the counter of negatives in the sorted matrix : " + countNegativesInMatrix(test1));
    }
}
