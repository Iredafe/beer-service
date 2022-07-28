package dafe.springframework.beerservice.Grokking;

import java.util.*;

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
        for(int i=0; i<prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(node.children.containsKey(ch)){
                node=node.children.get(ch);
            }
        }
        return node.isEnd;
    }

    private List<String> getRelatedString(List<String> words, String searchTerm1) {
        List<String> result = new ArrayList<>();

        for(String word : words){
            addWord(word);
        }

        for (String word : words){
            boolean isFound = searchTrieNode(searchTerm1, trie);
            if(isFound){
                result.add(word);
            }
        }
        return result;
    }


    private static List<String> prefixSearch(String[] words, String prefix){
        HashMap<String, Set<String>> dictionary = new HashMap<>();
        for(String word : words){
            String [] splitString = word.split("\\s+");
            for(int i=splitString.length-1; i>=0;i--){
                StringBuilder sb = new StringBuilder();
                String indexKey = sb.insert(0, ""+splitString[i]).toString().trim();
                Set<String> set = new HashSet<>();
                set.add(word);
                dictionary.putIfAbsent(indexKey, set);
            }
        }
        return new ArrayList<>();
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

}
