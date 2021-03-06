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

    public static int maxDepth2(TreeNode node) {
        return maxDepth2Helper(node, 0);
    }

    private static int maxDepth2Helper(TreeNode node, int depth) {

        if(node == null) return 0;

        return Math.max(maxDepth2Helper(node.left, depth+1), maxDepth2Helper(node.right, depth+1)) + 1;

    }

    public static int maxDepth(TreeNode node){
        LinkedList<Integer> depths = new LinkedList();
        LinkedList<TreeNode> stack = new LinkedList();

        if(node == null) return 0;
        stack.add(node);
        depths.add(1);

        int depth = 0; int currentDepth = 0;

        while(!stack.isEmpty()){

            currentDepth = depths.pollLast();
            node = stack.pollLast();

            if(node != null){
                depth = Math.max(depth, currentDepth);
                stack.addLast(node.left);
                stack.addLast(node.right);
                depths.addLast(currentDepth+1);
                depths.addLast(currentDepth+1);
            }
        }
        return depth;
    }

    public static void main(String[] args) {

        MaximumDepthOfTree tree = new MaximumDepthOfTree();

        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right=new TreeNode(7);

        System.out.println("This is the max depth : " + maxDepth(tree.root));
        System.out.println("This is the max depth 2 : " + maxDepth2(tree.root));
    }

}


