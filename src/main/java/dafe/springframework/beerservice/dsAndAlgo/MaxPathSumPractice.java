package dafe.springframework.beerservice.dsAndAlgo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
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

    //handle the base case
    //compute the left max path sum as a branch and the left running max sum
    //repeat for the right branch
    //compute max child sum as a branch
    //compute max sum of current tree
    //compute max sum as a root node
    // compute running max path sum
    //return maxpathsum and max sum as a branch
    public static int maxPathSum(BinaryTree tree) {
        List<Integer> maxSum = findMaxSum(tree);
        return maxSum.get(1);
    }

    public static List<Integer> findMaxSum(BinaryTree tree){

        if(tree == null) return new ArrayList<>(Arrays.asList(0, Integer.MIN_VALUE));

        List<Integer> leftMaxSumArray = findMaxSum(tree.left);
        Integer leftMaxSum = leftMaxSumArray.get(0);
        Integer leftMaxPathSumAsBranch = leftMaxSumArray.get(1);

        List<Integer> rightMaxSumArray= findMaxSum(tree.right);
        Integer rightMaxSum = rightMaxSumArray.get(0);
        Integer rightMaxSumAsBranch = rightMaxSumArray.get(1);

        Integer maxChildSumAsABranch = Math.max(rightMaxSumAsBranch, leftMaxPathSumAsBranch);
        Integer maxSumOfCurrentTree = Math.max(maxChildSumAsABranch + tree.value, tree.value);
        Integer maxSumAsRootNode = Math.max(leftMaxPathSumAsBranch + tree.value + rightMaxSumAsBranch, maxSumOfCurrentTree);
        Integer maxPathSum = Math.max(leftMaxSum, Math.max(rightMaxSum, maxSumAsRootNode));
    return new ArrayList<>(Arrays.asList(maxSumOfCurrentTree,maxPathSum));
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
