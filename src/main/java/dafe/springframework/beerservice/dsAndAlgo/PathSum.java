package dafe.springframework.beerservice.dsAndAlgo;

import java.util.LinkedList;

public class PathSum {

    private TreeNode root;

    static class TreeNode{
        int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public static boolean pathSum(TreeNode root, int targetSum){
        LinkedList<TreeNode> nodeStack= new LinkedList();
        LinkedList<Integer> sumStack = new LinkedList();

        nodeStack.add(root);
        sumStack.add(targetSum-root.val);

        int currentSum;
        TreeNode node;
        while(!nodeStack.isEmpty()){
            node = nodeStack.pollLast();
            currentSum = sumStack.pollLast();

            if(node.left==null && node.right==null && currentSum==0) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        PathSum tree = new PathSum();
        tree.root = new TreeNode();
    }
}
