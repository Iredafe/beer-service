package dafe.springframework.beerservice.dsAndAlgo;

import java.util.LinkedList;

public class MaximumDepthOfTree {

    private TreeNode root;

    static class TreeNode{
        int val;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public static int maxDepth(TreeNode node){
        LinkedList<Integer> depths = new LinkedList();
        LinkedList<TreeNode> stack = new LinkedList();

        if(node == null) return 0;
        stack.add(node);
        depths.add(1);

        int depth = 0; int currentDepth = 0;

        while(!stack.isEmpty()){
            depth = Math.max(depth, currentDepth);
            currentDepth = depths.pollLast();
            TreeNode currentNode = stack.pollLast();
        }
    }

    public static void main(String[] args) {

        MaximumDepthOfTree tree = new MaximumDepthOfTree();

        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right=new TreeNode(7);

    }

}


