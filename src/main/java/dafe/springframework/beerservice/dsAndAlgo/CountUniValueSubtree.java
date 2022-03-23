package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Objects;

public class CountUniValueSubtree {

    private TreeNode root;

    static class TreeNode{
        int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    //[5,1,5,5,5,null,5]

    public static void main(String[] args) {

        CountUniValueSubtree tree = new CountUniValueSubtree();
        tree.root = new TreeNode(5);
        tree.root.left = new TreeNode(1);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(5);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.right = new TreeNode(5);

    }
}
