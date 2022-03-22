package dafe.springframework.beerservice.dsAndAlgo;

public class IsSymmetric {

    private TreeNode _root;

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public static boolean isSymmetric(TreeNode root){

        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        return (root1.val==root2.val) &&
                isMirror(root1.left , root2.right) &&
                isMirror(root1.right , root2.left);
    }

    //1,2,2,3,4,4,3
    public static void main(String[] args) {
        IsSymmetric tree = new IsSymmetric();
        tree._root = new TreeNode(1);
        tree._root.left = new TreeNode(2);
        tree._root.right = new TreeNode(2);
        tree._root.left.left = new TreeNode(3);
        tree._root.left.right = new TreeNode(4);
        tree._root.right.left = new TreeNode(4);
        tree._root.right.right = new TreeNode(3);

        System.out.println("the tree is symmetrical ? " + isSymmetric(tree._root));
    }
}
