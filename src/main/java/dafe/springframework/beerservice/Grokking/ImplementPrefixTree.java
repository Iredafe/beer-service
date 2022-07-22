package dafe.springframework.beerservice.Grokking;

public class ImplementPrefixTree {

     class TrieNode{
         public static final int R=26;
         public TrieNode[] links;
         public boolean isEnd;

         public TrieNode() {
             links = new TrieNode[R];
         }

        public void put(char ch, TrieNode node){

        }

        public TrieNode get(char ch){
            return links[ch-'a'];
        }

        public TrieNode containsKey(char ch){

        }

        public boolean isEnd(){
             return isEnd;
        }
     }
    }

    class Trie {

        public static void insert(String word) {

        }
        public static boolean search(String word) {

        }

        public static boolean startsWith(String prefix) {

        }
}
