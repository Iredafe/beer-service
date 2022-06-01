package dafe.springframework.beerservice.Grokking;

public class SubarraysWithProductLessThanTarget {

    public static void main(String[] args) {
        System.out.println(
                findSubarrays(new int[] { 2, 5, 3, 10 }, 30));
        System.out.println(
                findSubarrays(new int[] { 8, 2, 6, 5 }, 50));
    }
}
