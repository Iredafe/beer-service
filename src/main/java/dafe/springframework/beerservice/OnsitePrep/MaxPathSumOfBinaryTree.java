package dafe.springframework.beerservice.OnsitePrep;

public class MaxPathSumOfBinaryTree {

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
}
