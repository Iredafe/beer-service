package dafe.springframework.beerservice.dsAndAlgo;

import java.util.*;

public class LowestCommonAncestor {

    private TreeNode root;

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

//[3,5,1,6,2,0,8,null,null,7,4]

    public static void main(String[] args) {
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        lowestCommonAncestor.root = new TreeNode(3);
        lowestCommonAncestor.root.left = new TreeNode(5);
        lowestCommonAncestor.root.right = new TreeNode(1);
        lowestCommonAncestor.root.left.left = new TreeNode(6);

    }
}
