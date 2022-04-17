package dafe.springframework.beerservice.OnsitePrep;

public class FindAndReplaceInString {

    private static String findAndReplaceInString(String word, int [] indices, String [] sources, String [] targets){

        return "";
    }

    public static void main(String[] args) {
        String wordString = "abcd";
        int [] indices = {0, 2};
        String [] target = {"eee", "ffff"};
        String [] sources = {"a", "cd"};

        System.out.println("This is the new string after replacement operation was done : "
        + findAndReplaceInString(wordString, indices, sources, target));
    }
}
