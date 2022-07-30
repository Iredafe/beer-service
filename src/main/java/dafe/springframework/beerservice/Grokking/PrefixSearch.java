package dafe.springframework.beerservice.Grokking;

import ch.qos.logback.core.util.COWArrayList;

import java.util.*;

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
                }
                trieNode=trieNode.dictionary.get(character);
                if(i==chars.length-1){
                    trieNode.isEnd = true;
                    trieNode.businessNames.add(stringFromBusinessNames);
                }
            }
        }

        public List<String> get(String prefix){
            if(prefix==null || prefix.length()==0) return null;
            List<String> result = new ArrayList<>();
            TrieNode trieNode = root;
            char [] character = prefix.toCharArray();
            for(char c : character) {
                trieNode = trieNode.dictionary.get(c);
                if (trieNode == null) {
                    return result;
                }
            }
            HashSet<String> set = new HashSet<>();
            dfsBackTrack(set, trieNode);
            result.addAll(set);

            return result;
        }

        public void dfsBackTrack(HashSet<String> set, TrieNode trieNode){
            if(trieNode.isEnd){
                set.addAll(trieNode.businessNames);
            }

            for(char character : trieNode.dictionary.keySet()){
                dfsBackTrack(set,trieNode.dictionary.get(character));
            }
        }

    }


    private List<String> getRelatedString(List<String> businessNames, String searchTerm){
        if(searchTerm==null || searchTerm.length()==0) return new ArrayList<>();
        List<String> result=new ArrayList<>();
        Trie trie = new Trie();
        for(String stringOfBusinessName : businessNames){
            String [] wordsInBusinessName = stringOfBusinessName.split(" ");
           for(String wordInStringOfBusinessNames : wordsInBusinessName){
               trie.add(wordInStringOfBusinessNames, stringOfBusinessName);
           }
        }

        String [] searchTermArray = searchTerm.split(" ");
       HashSet <String> set = new HashSet<>();
        for(String term :searchTermArray){
            if(set.isEmpty()){
                set.addAll(trie.get(term));
            }else {
                set.retainAll(trie.get(term));
            }
        }
        result.addAll(set);
        return result;
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
