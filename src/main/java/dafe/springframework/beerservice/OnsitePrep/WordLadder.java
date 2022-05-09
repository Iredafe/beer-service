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
        return 0;
    }
    public static void main(String[] args) {
        String beginWord = "hit"; String endWord = "cog";
        List<String> wordList = Arrays.asList(new String[]{"hot", "dot", "dog", "lot", "log","cog"});

        System.out.println("This is the shortest path to " + endWord+ " : " + ladderLength(beginWord, endWord, wordList));
    }
}
