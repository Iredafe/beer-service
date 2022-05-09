package dafe.springframework.beerservice.OnsitePrep;

import java.util.*;

public class WordLadder {

    public static int ladderLength(String startWord, String endWord, List<String> listOfWordsToClimb){

        Set<String> set = new HashSet<>(listOfWordsToClimb);
        if(!set.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(startWord);

        Set<String> visited = new HashSet<>();
        visited.add(startWord);
        int ladderLevel = 1;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                String word = queue.poll();
                if(word.equals(endWord)) return ladderLevel;

                for(int j=0; j<word.length(); j++){
                    for(char k = 'a'; k<= 'z'; k++){
                        char [] array = word.toCharArray();
                        array[j] = k;

                        String string = new String(array);
                        if(set.contains(string) && !visited.contains(string)){
                            visited.add(string);
                            queue.add(string);
                        }
                    }
                }
            }
            ++ladderLevel;
        }
        return 0;
    }
    public static void main(String[] args) {
        String beginWord = "hit"; String endWord = "cog";
        List<String> wordList = Arrays.asList(new String[]{"hot", "dot", "dog", "lot", "log","cog"});

        System.out.println("This is the shortest path to " + endWord+ " : " + ladderLength(beginWord, endWord, wordList));
    }
}
