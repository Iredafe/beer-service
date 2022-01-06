package dafe.springframework.beerservice.dsAndAlgo;

public class LowestCommonAncestor {

    private TreeNode result=null;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }
    public boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q){
        if(currentNode == null) return false;
        int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;
        int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;
        int mid = (currentNode == p || currentNode ==q) ? 1 : 0;
        return mid+left+right > 0;
    }
}
