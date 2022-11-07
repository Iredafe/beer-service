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


        return 0;
    }
}
