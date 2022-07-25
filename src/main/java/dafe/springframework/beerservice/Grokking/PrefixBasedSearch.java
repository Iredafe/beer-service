package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;

public class PrefixBasedSearch {


    public static void main(String[] args) {
        String[] input = {"burger king", "McDonald's", "super duper burger's", "subway", "pizza hut"};
        String searchTerm1 = "bur";
        String searchTerm2 = "duper bur";
        String searchTerm3 = "bur duper";
        PrefixBasedSearch ps = new PrefixBasedSearch();
        System.out.println(ps.getRelatedString(Arrays.asList(input), searchTerm1));
        System.out.println(ps.getRelatedString(Arrays.asList(input), searchTerm2));
        System.out.println(ps.getRelatedString(Arrays.asList(input), searchTerm3));
    }
}
