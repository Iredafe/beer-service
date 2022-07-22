package dafe.springframework.beerservice.Grokking;

public class ImplementPrefixTree {

    static class TrieNode {
        public static final int R = 26;
        public TrieNode[] links;
        public boolean isEnd;

        public TrieNode() {
            links = new TrieNode[R];
        }

        public void put(char ch, TrieNode node) {
            links[ch - 'a'] = node;
        }

        public void setEnd() {
            isEnd = true;
        }

        public TrieNode get(char ch) {
            return links[ch - 'a'];
        }

        public boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        public boolean isEnd() {
            return isEnd;
        }
    }


    static class Trie {
        public static TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public static void insert(String word) {
            TrieNode trieNode = root;
            for(int charIndex=0; charIndex<word.length(); charIndex++){
                char currentChar = word.charAt(charIndex);
                if(!trieNode.containsKey(currentChar)){
                    trieNode.put(currentChar, new TrieNode());
                    trieNode.setEnd();
                }
                trieNode=trieNode.get(currentChar);
            }
            trieNode.setEnd();
        }

        private static TrieNode searchPrefix(String word){
           TrieNode node = root;
           for(int i=0; i<word.length(); i++){
                char currentChar = word.charAt(i);
                if(node.containsKey(currentChar)){
                    node = node.get(currentChar);
                }
           }
            return node;
        }

        public static boolean search(String word) {

        }

        public static boolean startsWith(String prefix) {

        }

    }
}