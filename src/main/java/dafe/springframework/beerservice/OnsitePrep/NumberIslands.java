package dafe.springframework.beerservice.OnsitePrep;

import java.util.LinkedList;
import java.util.Queue;

public class NumberIslands {


    private static int numberOfIslandsBFS(char[][] grid) {

        int countIslands = 0;
        int [][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i< grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    bfs(grid, i, j, visited, directions);
                    countIslands++;
                }
            }
        }
    return countIslands;
    }

    private static void bfs(char[][] grid, int i, int j, boolean[][] visited, int[][] directions) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        visited[i][j]=true;

        while (!queue.isEmpty()){
            int [] current = queue.poll();

            for(int [] direction : directions){
                int row = current[0]+direction[0];
                int col = current[1]+direction[1];

                if(row>=0 && row < grid.length &&
                        col>=0 && col < grid[0].length &&
                        !visited[row][col] && grid[row][col]=='1' ) {
                    visited[row][col] = true;
                    queue.offer(new int[]{row, col});
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

        System.out.println("This is the number of islands in the grid : " + numberOfIslandsBFS(grid));
    }
}
