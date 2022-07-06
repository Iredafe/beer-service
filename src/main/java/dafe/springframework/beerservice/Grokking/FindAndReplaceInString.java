package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;

public class FindAndReplaceInString {

    private static String findAndReplaceInString(String word, int [] indices, String [] sources, String [] targets){

        StringBuilder result = new StringBuilder(word);
        HashMap<Integer, String> sourcesMap = new HashMap<>();
        HashMap<Integer, String> targetsMap = new HashMap<>();

        for(int i=0; i<indices.length; i++){
            sourcesMap.put(indices[i], sources[i]);
            targetsMap.put(indices[i], targets[i]);
        }

      //  Arrays.sort(indices);


        for(int i=indices.length-1; i>=0; i--){
            String source = sourcesMap.get(indices[i]);
            String target = targetsMap.get(indices[i]);

            int sourceLength = source.length();

            String stringToBeReplaced = word.substring(indices[i], indices[i]+sourceLength);
            if(stringToBeReplaced.equals(source)){
                result.replace(indices[i], indices[i]+ sourceLength, target);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String wordString = "vmokgggqzp";
        int [] indices = {3,5,1};
        String [] target = {"s","so","bfr"};
        String [] sources = {"kg","ggq","mo"};

        System.out.println("This is the new string after replacement operation was done : "
        + findAndReplaceInString(wordString, indices, sources, target));
    }
}
