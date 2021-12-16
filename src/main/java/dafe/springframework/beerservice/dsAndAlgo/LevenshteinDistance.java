package dafe.springframework.beerservice.dsAndAlgo;

public class LevenshteinDistance {

    public static int levDistance(String str1, String str2){

        return 1;
    }

    public static void main(String[] args) {
        String str1= "abc";
        String str2 = "yabd";

        System.out.println("This is the number of edits : " + levDistance(str1, str2));
    }
}
