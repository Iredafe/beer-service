package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrefixBasedSearch {
    static TrieNode trie;

    public PrefixBasedSearch(){
        trie = new TrieNode();
    }
    static class TrieNode{
        HashMap<Character, TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }

    private static void addWord(String word){
        TrieNode node = trie;
        for(char ch : word.toCharArray()){
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.isEnd=true;
    }

    private static boolean searchTrieNode(String prefix, TrieNode node){

        return true;
    }

    public static void main(String[] args) {
        String[] input = {"burger king", "McDonald's", "super duper burger's", "subway", "pizza hut"};
        String searchTerm1 = "bur";
        String searchTerm2 = "duper bur";
        String searchTerm3 = "bur duper";
        PrefixBasedSearch ps = new PrefixBasedSearch();
        System.out.println(ps.getRelatedString(Arrays.asList(input), searchTerm1));
        System.out.println(ps.getRelatedString(Arrays.asList(input), searchTerm2));
        System.out.println(ps.getRelatedString(Arrays.asList(input), searchTerm3));
    }

    private List<String> getRelatedString(List<String> words, String searchTerm1) {
        List<String> result = new ArrayList<>();
        return result;
    }
}
