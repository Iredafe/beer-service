package dafe.springframework.beerservice.dsAndAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    public int numberOfIslands(char[][] matrix){
        Queue<int[]> queue = new LinkedList<>();
            int count = 0;
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    queue.add(new int[]{i,j});
                }
            }
        }

        while (queue.size() > 0){

        }
        return count;
    }

    public static void main(String[] args) {
        char [][] grid = {
                        {'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}
                                            };
            }
}
