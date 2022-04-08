package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class GenerateDivTags {

    private static ArrayList<String> generateDivTags(int numberOfTags) {
        ArrayList<String> matchedDivTags = new ArrayList<>();
        generateTagsFromPrefix(numberOfTags, numberOfTags, "", matchedDivTags);
        return matchedDivTags;
    }

    private static void generateTagsFromPrefix(int openingTagsLeft,
                                               int closingTagsLeft,
                                               String prefix,
                                               ArrayList<String> result) {
        if(openingTagsLeft > 0){
            String newPrefix = prefix+"<div>";
            generateTagsFromPrefix(openingTagsLeft-1, closingTagsLeft, newPrefix, result);
        }

        if(openingTagsLeft<closingTagsLeft){
            String newPrefix = prefix + "</div>";
            generateTagsFromPrefix(openingTagsLeft, closingTagsLeft, newPrefix, result);
        }

        if(closingTagsLeft==0){
            result.add(prefix);
        }
    }

    public static void main(String[] args) {
        int numberOfTags = 3;

        System.out.println("These are the generated div tags :" + generateDivTags(numberOfTags));
    }

}
