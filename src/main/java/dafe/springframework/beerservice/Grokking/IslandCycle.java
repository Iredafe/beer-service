package dafe.springframework.beerservice.Grokking;

public class IslandCycle {

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
