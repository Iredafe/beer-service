package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SimilarityIndex {

    private static double similarityIndex(String bizName1, String bizName2){

        double jacardSimilarityIndex=0;
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();

        String [] bizNameArray1 = bizName1.replace("?","").split(" ");
        String [] bizNameArray2 = bizName2.replace("?","").split(" ");

        for(String word : bizNameArray1){
            set1.add(word);
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        for (String word : bizNameArray2){
            set2.add(word);
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        set1.retainAll(set2);
        double intersectionSize = set1.size();
        double union1 = map.size();
//        double union = bizNameArray1.length+bizNameArray2.length-intersectionSize;

        jacardSimilarityIndex= intersectionSize/union1;
        return jacardSimilarityIndex;
    }
    public static void main(String[] args) {
        String string1="Joe's? Pizza";
        String string2 = "Sweet Joe's Pizza";

        System.out.println("Similarity index is : " + similarityIndex(string1, string2));
    }
}
