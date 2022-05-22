package dafe.springframework.beerservice.OnsitePrep;

import com.sun.source.tree.Tree;

public class DiameterOfABinaryTree {

    static int diameter;

    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value){
            this.value = value;
        }

        private static int findDiameter(TreeNode root){
            diameter = 0;
            longestPath(root);
            return diameter;
        }
    }

    public static void main(String[] args) {

    }
}
