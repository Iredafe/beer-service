package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class GenerateDivTags {

    private static ArrayList<String> generateDivTags(int numberOfTags) {
        ArrayList<String> matchedDivTags = new ArrayList<>();
        generateTagsFromPrefix(numberOfTags, numberOfTags, "", matchedDivTags);
        return matchedDivTags;
    }

    public static void main(String[] args) {
        int numberOfTags = 3;

        System.out.println("These are the generated div tags :" + generateDivTags(numberOfTags));
    }

}
