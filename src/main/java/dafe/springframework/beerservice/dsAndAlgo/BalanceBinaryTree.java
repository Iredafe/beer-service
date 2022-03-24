package dafe.springframework.beerservice.dsAndAlgo;

public class BalanceBinaryTree {

    private TreeNode root;

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

    private static int getTreeHeight(TreeNode node) {
        if(node == null) return -1;

        return 1 + Math.max(getTreeHeight(node.left), getTreeHeight(node.right));
    }

    public static void main(String[] args) {
        BalanceBinaryTree tree = new BalanceBinaryTree();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);
    }
}
