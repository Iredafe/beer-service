package dafe.springframework.beerservice.Grokking;

public class PermutationInAString {

    public static void main(String[] args) {
        System.out.println("Permutation exist: "
                + findPermutation("oidbcaf", "abc"));
        System.out.println("Permutation exist: "
                + findPermutation("odicf", "dc"));
        System.out.println("Permutation exist: "
                + findPermutation("bcdxabcdy", "bcdyabcdx"));
        System.out.println("Permutation exist: "
                + findPermutation("aaacb", "abc"));
    }
}
