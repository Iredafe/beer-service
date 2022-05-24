package dafe.springframework.beerservice.Grokking;

public class PermutationInAString {

    private static boolean findPermutation(String word, String pattern){

        return false;
    }
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
