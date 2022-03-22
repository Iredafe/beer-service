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

        return true;
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
    }
}
