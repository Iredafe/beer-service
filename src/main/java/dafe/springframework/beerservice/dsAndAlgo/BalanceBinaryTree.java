package dafe.springframework.beerservice.dsAndAlgo;

public class BalanceBinaryTree {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public static boolean isBalancedTopDown(TreeNode root){

        if(root == null ) return true;

        return Math.abs(getTreeHeight(root.right) - getTreeHeight(root.left)) < 2
                && isBalancedTopDown(root.left)
                && isBalancedTopDown(root.right);
    }

}
