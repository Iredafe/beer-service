package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.List;

public class ConcatenatedWords {

    private static List<Integer> findWordConcatenation(String string, String [] words){
        List<Integer> resultIndices = new ArrayList<>();



        return resultIndices;
    }
    public static void main(String[] args) {
        List<Integer> result = findWordConcatenation(
                "catfoxcat", new String[] { "cat", "fox" });
        System.out.println(result);
        result = findWordConcatenation(
                "catcatfoxfox", new String[] { "cat", "fox" });
        System.out.println(result);
    }
}
