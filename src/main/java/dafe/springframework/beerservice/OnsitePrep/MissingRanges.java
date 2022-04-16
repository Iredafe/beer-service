package dafe.springframework.beerservice.OnsitePrep;

public class MissingRanges {

    public static void main(String[] args) {
        int [] array = {0,1,3,50,75};
        System.out.println("These are the missing ranges : " + findMissingRanges(array));
    }
}
