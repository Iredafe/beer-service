package dafe.springframework.beerservice.dsAndAlgo;

import java.util.List;

public class MaxPathSumPractice {

    static BinaryTree root;
    static class BinaryTree{
        BinaryTree left;
        BinaryTree right;
        int value;

        public BinaryTree(int value){
            this.value=value;
        }
    }

    public static List<Integer> maxPathSum(BinaryTree tree) {

    }

    public static void main(String[] args) {

        MaxPathSumPractice tree = new MaxPathSumPractice();
        tree.root = new BinaryTree(1);
        tree.root.left = new BinaryTree(2);
        tree.root.right = new BinaryTree(3);
        tree.root.left.left = new BinaryTree(4);
        tree.root.left.right = new BinaryTree(5);
        tree.root.right.left = new BinaryTree(6);
        tree.root.right.right=new BinaryTree(7);

        System.out.println("This is the max path sum : " + tree.maxPathSum(root));
    }


}
