package dafe.springframework.beerservice.OnsitePrep;

public class CountCompleteTreeNode {
    static BinaryTree root;
    static class BinaryTree{
        int value; BinaryTree left; BinaryTree right;

        public BinaryTree(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CountCompleteTreeNode tree = new CountCompleteTreeNode();

        tree.root = new BinaryTree(1);
        tree.root.right = new BinaryTree(2);
        tree.root.left = new BinaryTree(3);
        tree.root.left.left= new BinaryTree(4);
        tree.root.left.right = new BinaryTree(5);
        tree.root.right.left = new BinaryTree(6);
    }
}
