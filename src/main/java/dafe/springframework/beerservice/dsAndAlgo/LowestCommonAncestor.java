package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayDeque;
import java.util.Deque;

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
        int left = recurseTree(currentNode.left, p, q) ? 1 : 0;
        int right = recurseTree(currentNode.right, p, q) ? 1 : 0;
        int mid = (currentNode == p || currentNode ==q) ? 1 : 0;
        if(left+right+mid >= 2) this.result = currentNode;
        return mid+left+right > 0;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        recurseTree(root, p, q);
        return this.result;
    }

    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q){

        Deque<TreeNode> stack = new ArrayDeque<>();
    }

    public static void main(String[] args) {

    }
}
