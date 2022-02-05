package dafe.springframework.beerservice.dsAndAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    public static int numberOfIslands(char[][] matrix){
        Queue<int[]> queue = new LinkedList<>();
            int count = 0;
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    queue.add(new int[]{i,j});

                }
            }
        }

        int [][] directions = {{1,0}, {0,-1}, {0,1}, {-1,0}};
        while (queue.size() > 0){
            for(int index=0; index< queue.size(); index++){
                int current[] = queue.poll();
                int currentRow = current[0];
                int currentCol = current[1];

                for(int [] direction:directions){
                    int row = direction[0] + currentRow;
                    int col = direction[1] + currentCol;

                    if(row < 0 || col <0 || row >= matrix.length || col >= matrix[0].length) continue;
                    if( matrix[row][col] == 0) count++;
                    queue.add(new int[]{row,col});
                }
            }
        }
        return count;
    }

    public static int numberOfIslandsDFS(char[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    dfs(matrix, i, j, count);
                }
            }
        }
    }
    public static void main(String[] args) {
        char [][] grid = {
                        {'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}
                                            };

        System.out.println("This is the number of islands in the grid : " + numberOfIslands(grid));


            }




}
