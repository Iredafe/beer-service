package dafe.springframework.beerservice.Grokking;

public class IslandPerimeter {

    private static int findIslandPerimeter(int [][] grid){

        int islandPerimeter = 0;

        return islandPerimeter;
    }

    public static void main(String[] args) {
    System.out.println(findIslandPerimeter(
            new int[][] {
        { 1, 1, 0, 0, 0 },
        { 0, 1, 0, 0, 0 },
        { 0, 1, 0, 0, 0 },
        { 0, 1, 1, 0, 0 },
        { 0, 0, 0, 0, 0 }
    }));

    System.out.println(findIslandPerimeter(
            new int[][] {
        { 0, 0, 0, 0 },
        { 0, 1, 0, 0 },
        { 0, 1, 0, 0 },
        { 0, 1, 1, 0 },
        { 0, 1, 0, 0 }
    }));
}
}

