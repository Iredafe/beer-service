package dafe.springframework.beerservice.Grokking;

public class IslandPerimeter {

    private static int getIslandPerimeter(int [][] grid){

        for(int i=0; i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                boolean[][] visited = new boolean[grid.length][grid[0].length];
                if(grid[i][j]==1 && !visited[i][j]){
                    return getIslandPerimeterDFS(grid, i, j, visited);
                }
            }
        }
        return 0;
    }

    private static int getIslandPerimeterDFS(int[][] matrix, int row, int col, boolean[][] isVisited){
        if(row < 0 || row >= matrix.length || col < 0 || col >= matrix.length) return 1;
        if(matrix[row][col] == 0) return 1;
        if(isVisited[row][col]) return 0;
        isVisited[row][col] = true;

        int count = 0;

        count+= getIslandPerimeterDFS(matrix, row+1, col, isVisited);
        count+= getIslandPerimeterDFS(matrix, row-1, col, isVisited);
        count+= getIslandPerimeterDFS(matrix, row, col+1, isVisited);
        count+= getIslandPerimeterDFS(matrix, row, col-1, isVisited);

        return count;
    }

    public static void main(String[] args) {
    System.out.println(getIslandPerimeter(
            new int[][] {
        { 1, 1, 0, 0, 0 },
        { 0, 1, 0, 0, 0 },
        { 0, 1, 0, 0, 0 },
        { 0, 1, 1, 0, 0 },
        { 0, 0, 0, 0, 0 }
    }));

    System.out.println(getIslandPerimeter(
            new int[][] {
        { 0, 0, 0, 0 },
        { 0, 1, 0, 0 },
        { 0, 1, 0, 0 },
        { 0, 1, 1, 0 },
        { 0, 1, 0, 0 }
    }));
}
}

