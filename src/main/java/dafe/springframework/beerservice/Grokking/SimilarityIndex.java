package dafe.springframework.beerservice.Grokking;

import java.util.HashSet;
import java.util.Set;

public class SimilarityIndex {

    private static double similarityIndex(String bizName1, String bizName2){

        double jacardSimilarityIndex=0;
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        String [] bizNameArray1 = bizName1.replace("?","").split(" ");
        String [] bizNameArray2 = bizName2.replace("?","").split(" ");

        for(String word : bizNameArray1){
            set1.add(word);
        }

        for (String word : bizNameArray2){
            set2.add(word);
        }

        set1.retainAll(set2);
        double intersectionSize = set1.size();
        double union = bizNameArray1.length+bizNameArray2.length-intersectionSize;

        jacardSimilarityIndex= intersectionSize/union;
        return jacardSimilarityIndex;
    }
    public static void main(String[] args) {
        String string1="Joe's? Pizza";
        String string2 = "Sweet Joe's Pizza";

        System.out.println("Similarity index is : " + similarityIndex(string1, string2));
    }
}
