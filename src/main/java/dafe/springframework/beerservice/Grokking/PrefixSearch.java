package dafe.springframework.beerservice.Grokking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrefixSearch {

    static class TrieNode{
        boolean isEnd = false;
        HashMap<Character, TrieNode> dictionary = new HashMap<>();
        List<String> businessNames = new ArrayList<>();
    }

    class Trie{
        TrieNode root = new TrieNode();

        public void add(String wordFromString, String stringFromBusinessNames){
            TrieNode trieNode = root;
            char [] chars = wordFromString.toCharArray();
            for(int i=0; i<chars.length; i++){
                char character = chars[i];
                if(!trieNode.dictionary.containsKey(character)){
                    trieNode.dictionary.put(character, new TrieNode());
                    if(i==chars.length-1){
                        trieNode.isEnd = true;
                        trieNode.businessNames.add(stringFromBusinessNames);
                    }
                }
            }
        }

        public List<String> get(String prefix){

            return new ArrayList<>();
        }

    }


    private static List<String> getRelatedString(List<String> words, String prefix){

        return new ArrayList<>();
    }

    public static void main(String[] args) {

        String[] input = {"burger king", "McDonald's", "super duper burger's", "subway", "pizza hut"};
        String searchTerm1 = "bur";
        String searchTerm2 = "duper bur";
        String searchTerm3 = "bur duper";
        PrefixSearch ps = new PrefixSearch();
        System.out.println(ps.getRelatedString(Arrays.asList(input), searchTerm1));
        System.out.println(ps.getRelatedString(Arrays.asList(input), searchTerm2));
        System.out.println(ps.getRelatedString(Arrays.asList(input), searchTerm3));
    }
}
