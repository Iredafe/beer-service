package dafe.springframework.beerservice.OnsitePrep;

import java.util.Arrays;
import java.util.List;

public class WordLadder {

    public static int ladderLength(String startWord, String endWord, List<String> listOfWordsToClimb){

        return 0;
    }
    public static void main(String[] args) {
        String beginWord = "hit"; String endWord = "cog";
        List<String> wordList = Arrays.asList(new String[]{"hot", "dot", "dog", "lot", "log","cog"});

        System.out.println("This is the shortest path to " + endWord+ " : " + ladderLength(beginWord, endWord, wordList));
    }
}
