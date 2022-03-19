package dafe.springframework.beerservice.dsAndAlgo;

public class MaximumDepthOfTree {

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
}
