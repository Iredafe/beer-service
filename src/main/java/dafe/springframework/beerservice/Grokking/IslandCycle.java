package dafe.springframework.beerservice.Grokking;

public class IslandCycle {

    private static boolean hasCycle(char [][] matrix){
        boolean [][] visited = new boolean[matrix.length][matrix[0].length];
        for(int row=0; row < matrix.length; row++){
            for(int col =0; col<matrix[0].length; col++){
                if(!visited[row][col]) {
                   return islandContainsCycle(matrix, visited, matrix[row][col],row, col, -1, -1);
                }
            }
        }
        return false;
    }

    private static boolean islandContainsCycle(char [][] grid,
                                               boolean [][] isVisited,
                                               char startingCharacter,
                                               int row,
                                               int col,
                                               int previousRow,
                                               int previousCol){
        if(row<0 || row >= grid.length || col < 0 || col >= grid[0].length) return false;
        if(isVisited[row][col]) return true;
        if(grid[row][col] != startingCharacter) return false;

        isVisited[row][col] = true;

        if(row+1 != previousRow && islandContainsCycle(grid, isVisited, grid[row][col],row+1, col, row,col)) return true;
        if(row-1 != previousRow && islandContainsCycle(grid, isVisited, grid[row][col],row-1, col, row,col)) return true;
        if(col+1 != previousCol && islandContainsCycle(grid, isVisited, grid[row][col],row, col+1, row,col)) return true;
        if(col-1 != previousCol && islandContainsCycle(grid, isVisited, grid[row][col],row, col-1, row,col)) return true;

    return false;
    }


    public static void main(String[] args) {
        System.out.println(hasCycle(
                new char[][] {
                        { 'a', 'a', 'a', 'a' },
                        { 'b', 'a', 'c', 'a' },
                        { 'b', 'a', 'c', 'a' },
                        { 'b', 'a', 'a', 'a' }
                }));

        System.out.println(hasCycle(
                new char[][] {
                        { 'a', 'a', 'a', 'a' },
                        { 'a', 'b', 'b', 'a' },
                        { 'a', 'b', 'a', 'a' },
                        { 'a', 'a', 'a', 'c' }
                }));

        System.out.println(hasCycle(
                new char[][] {
                        { 'a', 'b', 'e', 'b' },
                        { 'b', 'b', 'b', 'b' },
                        { 'b', 'c', 'c', 'd' },
                        { 'c', 'c', 'd', 'd' }
                }));

    }
}
