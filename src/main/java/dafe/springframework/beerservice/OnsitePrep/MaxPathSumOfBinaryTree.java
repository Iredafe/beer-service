package dafe.springframework.beerservice.OnsitePrep;

import dafe.springframework.beerservice.dsAndAlgo.MaxPathSumPractice;

public class MaxPathSumOfBinaryTree {

    private static TreeNode root;

    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){
            this.value = value;
        }
    }
   static int maxPathSum = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode node){
        dfs(node);
        return maxPathSum;
    }

    static int dfs(TreeNode root){
        if(root == null) return 0;

        int leftMax = Math.max(dfs(root.left), 0);
        int rightMax = Math.max(dfs(root.right), 0);
        int sumThroughRoot = root.value + leftMax + rightMax;

        maxPathSum = Math.max(maxPathSum, sumThroughRoot);

        return root.value + Math.max(rightMax, leftMax);
    }

    public static void main(String[] args) {
        MaxPathSumOfBinaryTree tree = new MaxPathSumOfBinaryTree();
        tree.root = new TreeNode(-10);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);

        System.out.println(
                "This is the max path sum of the tree : " + tree.maxPathSum(root));
    }
}
