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

    public static void main(String[] args) {

        CountUniValueSubtree tree = new CountUniValueSubtree();
        tree.root = new TreeNode(5);

    }
}
