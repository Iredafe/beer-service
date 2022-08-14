package dafe.springframework.beerservice.Grokking;

import java.util.HashSet;
import java.util.Set;

public class SimilarityIndex {

    private static double similarityIndex(String bizName1, String bizName2){

        double jacardSimilarityIndex=0;
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        String [] bizNameArray1 = bizName1.split(" ");
        String [] bizNameArray2 = bizName2.split(" ");

        for(String word : bizNameArray1){
            set1.add(word);
        }

        for (String word : bizNameArray2){
            set2.add(word);
        }

        Set<String> intersection = set1.retainAll(set2);
        Set<String> union = set1.addAll(set2);
        return jacardSimilarityIndex;
    }
    public static void main(String[] args) {
        String string1="Joe's Pizza";
        String string2 = "Sweet Joe's Pizza";

        System.out.println("Similarity index is : " + similarityIndex(string1, string2));
    }
}
