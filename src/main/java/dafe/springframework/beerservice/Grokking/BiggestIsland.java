package dafe.springframework.beerservice.Grokking;

public class BiggestIsland {


    public static void main(String[] args) {
        System.out.println(maxAreaOfIsland(
                new int[][] {
                        { 1, 1, 1, 0, 0 },
                        { 0, 1, 0, 0, 1 },
                        { 0, 0, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 1, 0, 0 }
                }));
    }
}
