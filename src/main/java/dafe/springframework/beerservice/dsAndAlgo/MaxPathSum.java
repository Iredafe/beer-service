package dafe.springframework.beerservice.dsAndAlgo;

public class MaxPathSum {

    static BinaryTree root;
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {

        MaxPathSum tree = new MaxPathSum();
        tree.root = new BinaryTree(1);
        tree.root.left = new BinaryTree(2);
        tree.root.right = new BinaryTree(3);
        tree.root.left.left = new BinaryTree(4);
        tree.root.left.right = new BinaryTree(5);
        tree.root.right.left = new BinaryTree(6);
        tree.root.right.right=new BinaryTree(7);
    }
}
