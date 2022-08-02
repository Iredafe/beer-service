package dafe.springframework.beerservice.Grokking;

public class NumberOfIslands {

    public static void main(String[] args) {
        System.out.println(" The total number Islands in the grid is " +countIslands(
                new int[][] {
                        { 0, 1, 1, 1, 0 },
                        { 0, 0, 0, 1, 1 },
                        { 0, 1, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0 }
                }));

    }
}
