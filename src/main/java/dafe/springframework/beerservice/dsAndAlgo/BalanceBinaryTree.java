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


    public static boolean isBalancedBottomUp(TreeNode root){
        return getTreeInfo(root).isBalanced;
    }

    private static TreeInfo getTreeInfo(TreeNode root) {
        if(root==null) return new TreeInfo(-1, true);

        TreeInfo leftSubTree = getTreeInfo(root.left);
        TreeInfo rightSubTree = getTreeInfo(root.right);

        boolean isBalanced = Math.abs(leftSubTree.height - rightSubTree.height) < 2
                && leftSubTree.isBalanced &&
                rightSubTree.isBalanced;

        int height = 1 + Math.max(leftSubTree.height, rightSubTree.height);
        return new TreeInfo(height, isBalanced);
    }


    public static void main(String[] args) {
        BalanceBinaryTree tree = new BalanceBinaryTree();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);

        System.out.println("is this tree height balanced 1 ? : " + isBalancedTopDown(tree.root));
        System.out.println("is this tree height balanced 2 ? : " + isBalancedBottomUp(tree.root));
    }

    private static class TreeInfo {
        int height;
        boolean isBalanced;

        public TreeInfo(int height, boolean isBalanced){
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }
}
