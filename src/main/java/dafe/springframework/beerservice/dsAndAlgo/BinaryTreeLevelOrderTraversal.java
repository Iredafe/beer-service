package dafe.springframework.beerservice.dsAndAlgo;

import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    static BinaryTree root;
     static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }

    public  static List<List<Integer>> levelOrder(BinaryTree root){

         return null;
    }

    public static void main(String[] args) {

         BinaryTreeLevelOrderTraversal tree = new BinaryTreeLevelOrderTraversal();

        tree.root = new BinaryTree(1);
        tree.root.left = new BinaryTree(2);
        tree.root.right = new BinaryTree(3);
        tree.root.left.left = new BinaryTree(4);
        tree.root.left.right = new BinaryTree(5);
        tree.root.right.left = new BinaryTree(6);
        tree.root.right.right=new BinaryTree(7);
        tree.root.left.left.left = new BinaryTree(8);
        tree.root.left.left.right = new BinaryTree(9);
        tree.root.left.right.left = new BinaryTree(10);

    }
}
