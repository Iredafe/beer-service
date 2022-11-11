package dafe.springframework.beerservice.Grokking;

public class CycleInCirclarArray {

    public static void main(String[] args) {
        System.out.println(loopExists(new int[] { 1, 2, -1, 2, 2 }));
        System.out.println(loopExists(new int[] { 2, 2, -1, 2 }));
        System.out.println(loopExists(new int[] { 2, 1, -1, -2 }));
    }
}
