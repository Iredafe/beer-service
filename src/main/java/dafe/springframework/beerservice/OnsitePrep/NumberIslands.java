package dafe.springframework.beerservice.OnsitePrep;

public class NumberIslands {

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
