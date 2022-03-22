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

    //5,4,8,11,null,13,4,7,2,null,null,null,1
    public static void main(String[] args) {
        PathSum tree = new PathSum();
        tree.root = new TreeNode(5);
        tree.root.left = new TreeNode(4);
        tree.root.right = new TreeNode(8);
        tree.root.left.left = new TreeNode(11);
        tree.root.left.right.left = new TreeNode(13);
        tree.root.left.right.right = new TreeNode(4);
        tree.root.left.left.left = new TreeNode(7);
        tree.root.left.left.right = new TreeNode(2);
        tree.root.right.right.right = new TreeNode(1);

        System.out.println("Does this tree have a path sum? " + pathSum(tree.root, 22));
    }
}
