package dafe.springframework.beerservice.Grokking;

public class LongestSubstringWithKDistinctCharacters {


    public static void main(String[] args) {
        System.out.println("Length of the longest substring: "
                + findLength("araaci", 2));
        System.out.println("Length of the longest substring: "
                + findLength("araaci", 1));
        System.out.println("Length of the longest substring: "
                + findLength("cbbebi", 3));
    }
}
