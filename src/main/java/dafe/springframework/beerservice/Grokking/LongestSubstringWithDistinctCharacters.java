package dafe.springframework.beerservice.Grokking;

public class LongestSubstringWithDistinctCharacters {

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: "
                + findLength("aabccbb"));
        System.out.println("Length of the longest substring: "
                + findLength("abbbb"));
        System.out.println("Length of the longest substring: "
                + findLength("abccde"));
    }
}
