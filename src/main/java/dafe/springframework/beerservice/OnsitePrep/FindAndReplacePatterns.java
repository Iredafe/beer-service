package dafe.springframework.beerservice.OnsitePrep;

public class FindAndReplacePatterns {


    public static void main(String[] args) {
        String words []=new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        System.out.println("These are the words that match the pattern : " + findAndReplace(words, pattern));

    }
}
