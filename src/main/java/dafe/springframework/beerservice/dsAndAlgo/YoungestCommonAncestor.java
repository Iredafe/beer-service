package dafe.springframework.beerservice.dsAndAlgo;

public class YoungestCommonAncestor {

    static BinaryTree root;
    static class BinaryTree{
        public char name;
        public BinaryTree ancestor;

        public BinaryTree(char name){
            this.name = name;
            this.ancestor = null;
        }

    }

    public static void main(String[] args) {

        YoungestCommonAncestor tree = new YoungestCommonAncestor();
        tree.root = new BinaryTree('A');
        tree.root.ancestor = new BinaryTree('B');
        tree.root = new BinaryTree('A');
        tree.root = new BinaryTree('A');
        tree.root = new BinaryTree('A');
        tree.root = new BinaryTree('A');
        tree.root = new BinaryTree('A');
        tree.root = new BinaryTree('A');
    }
}
