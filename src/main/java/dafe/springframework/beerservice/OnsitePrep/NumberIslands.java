package dafe.springframework.beerservice.OnsitePrep;

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
