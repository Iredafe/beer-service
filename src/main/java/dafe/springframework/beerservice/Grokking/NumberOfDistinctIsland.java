package dafe.springframework.beerservice.Grokking;

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

        for(int row=0; row< grid.length; row++){
            for(int col=0; col<grid[0].length; col++){
                if(grid[row][col] == 1 && !visited[row][col]){

                }
            }
        }
        return 0;
    }
}
