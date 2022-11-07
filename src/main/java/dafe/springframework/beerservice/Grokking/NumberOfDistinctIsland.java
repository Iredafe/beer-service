package dafe.springframework.beerservice.Grokking;

import java.util.HashSet;

public class NumberOfDistinctIsland {
    public static void main(String[] args) {
        System.out.println(findDistinctIslandsDFS(
                new int[][] {
                        { 1, 1, 0, 1, 1 },
                        { 1, 1, 0, 1, 1 },
                        { 0, 0, 0, 0, 0 },
                        { 0, 1, 1, 0, 1 },
                        { 0, 1, 1, 0, 1 }
                }));

        System.out.println(findDistinctIslandsDFS(
                new int[][] {
                        { 1, 1, 0, 1 },
                        { 0, 1, 1, 0 },
                        { 0, 0, 0, 0 },
                        { 1, 1, 0, 0 },
                        { 0, 1, 1, 0 }
                }));
    }

    private static int findDistinctIslandsDFS(int[][] grid) {
        HashSet<String> islandSet = new HashSet<>();

        boolean [][] visited = new boolean[grid.length][grid[0].length];
        for(int row=0; row< grid.length; row++){
            for(int col=0; col<grid[0].length; col++){
                if(grid[row][col] == 1 && !visited[row][col]){
                    StringBuilder coordinates = new StringBuilder();
                    dfs(grid, visited, row, col, coordinates, "O");
                    islandSet.add(coordinates.toString());
                }
            }
        }
        return islandSet.size();
    }

    private static void dfs(int [][] matrix,
                            boolean [][] isVisited,
                            int row,
                            int col,
                            StringBuilder cordinates,
                            String direction){
        if(row<0 || row >= matrix.length || col < 0 || col >= matrix[0].length) return;
        if(matrix[row][col] == 0 || isVisited[row][col]) return;

        isVisited[row][col] = true;
        cordinates.append(direction);
        dfs(matrix, isVisited, row+1, col, cordinates, "D");
        dfs(matrix, isVisited, row-1, col, cordinates, "U");
        dfs(matrix, isVisited, row, col+1, cordinates, "R");
        dfs(matrix, isVisited, row, col-1, cordinates, "L");

        cordinates.append("B");
    }
}
