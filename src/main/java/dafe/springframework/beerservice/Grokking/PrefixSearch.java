package dafe.springframework.beerservice.Grokking;

import java.util.HashMap;

public class PrefixSearch {

    static class TrieNode{
        boolean isEnd = false;
        HashMap<Character, TrieNode> dictionary = new HashMap<>();
    }
}
