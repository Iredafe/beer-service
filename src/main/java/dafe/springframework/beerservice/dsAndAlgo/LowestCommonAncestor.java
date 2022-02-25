package dafe.springframework.beerservice.dsAndAlgo;

import java.util.*;

public class LowestCommonAncestor {

    private TreeNode root;

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public static TreeNode getLowestCommonAncestor(TreeNode first, TreeNode second){
        if(first==null || second==null) return null;

        int firstDepth = getDepth(first);
        int secondDepth = getDepth(second);

        if(firstDepth > secondDepth){
            return backtrack(first, second, firstDepth-secondDepth);
        }else{
            return backtrack(second, first, secondDepth-firstDepth);
        }
    }


    public static int getDepth(TreeNode child){
        int depth = 0;
        while(child!=null){
            depth++;
            child = child.parent;
        }
        return depth;
    }

    public static TreeNode backtrack(TreeNode lower, TreeNode higher, int difference){
        while(difference > 0){
            difference--;
            lower = lower.parent;
        }

        while (lower != higher){
            lower = lower.parent;
            higher = higher.parent;
        }
        return lower;
    }

//[3,5,1,6,2,0,8,null,null,7,4]

    public static void main(String[] args) {
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        lowestCommonAncestor.root = new TreeNode(3);
        lowestCommonAncestor.root.left = new TreeNode(5);
        lowestCommonAncestor.root.right = new TreeNode(1);
        lowestCommonAncestor.root.left.left = new TreeNode(6);
        lowestCommonAncestor.root.left.right = new TreeNode(2);
        lowestCommonAncestor.root.right.left = new TreeNode(0);
        lowestCommonAncestor.root.right.right = new TreeNode(8);
        lowestCommonAncestor.root.right.left.left = new TreeNode(7);
        lowestCommonAncestor.root.right.left.right = new TreeNode(4);


    }
}
