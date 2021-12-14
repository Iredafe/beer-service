package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static int maxPathSum(BinaryTree tree){
        List<Integer> maxSumArray= findMaxSum(tree);
        return maxSumArray.get(0);
    }

    public static List<Integer> findMaxSum(BinaryTree tree){
        if(tree == null) return  new ArrayList<>(Arrays.asList(Integer.MIN_VALUE));

        List<Integer> leftMaxSumArray = findMaxSum(tree.left);
        Integer leftMaxSumAsBranch = leftMaxSumArray.get(0);
        Integer leftMaxPathSum = leftMaxSumArray.get(1);

        List<Integer> rightMaxSumArray = findMaxSum(tree.right);
        Integer rightMaxSumAsBranch = rightMaxSumArray.get(0);
        Integer rightMaxPathSum = rightMaxSumArray.get(1);

        Integer maxChildSumAsBranch = Math.max(leftMaxSumAsBranch, rightMaxSumAsBranch);
        Integer maxSumAsBranch = Math.max(maxChildSumAsBranch + tree.value, tree.value);
        Integer maxSumAsRootNode = Math.max(leftMaxSumAsBranch+ tree.value + rightMaxSumAsBranch, maxSumAsBranch);
        int maxPathSum = Math.max(leftMaxPathSum, Math.max(rightMaxPathSum, maxSumAsRootNode));
        return new ArrayList<>(Arrays.asList(maxSumAsBranch, maxPathSum));
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

        System.out.println("This is the max path sum : " + tree.maxPathSum(root));
    }
}
