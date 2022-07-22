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
        public TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public static void insert(String word) {
            if ()
        }

        public static boolean search(String word) {

        }

        public static boolean startsWith(String prefix) {

        }

    }
}