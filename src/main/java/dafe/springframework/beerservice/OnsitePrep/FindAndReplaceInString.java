package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashMap;

public class FindAndReplaceInString {

    private static String findAndReplaceInString(String word, int [] indices, String [] sources, String [] targets){

        StringBuilder result = new StringBuilder(word);
        HashMap<Integer, String> sourcesMap = new HashMap<>();
        HashMap<Integer, String> targetsMap = new HashMap<>();

        for(int i=0; i<word.length(); i++){
            sourcesMap.put(indices[i], sources[i]);
            targetsMap.put(indices[i], targets[i]);
        }
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
