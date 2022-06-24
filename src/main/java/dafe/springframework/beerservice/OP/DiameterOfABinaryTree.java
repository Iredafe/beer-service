package dafe.springframework.beerservice.OP;

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

        private static int longestPath(TreeNode node){
            if(node == null) return 0;

            int leftPath = longestPath(node.left);
            int rightPath = longestPath(node.right);

            diameter = Math.max(diameter, leftPath+rightPath);

            return Math.max(leftPath, rightPath) +1;
        }
    }

    public static void main(String[] args) {

    }
}
