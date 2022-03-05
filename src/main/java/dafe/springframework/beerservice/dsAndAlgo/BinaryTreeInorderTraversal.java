package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class BinaryTreeInorderTraversal {
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  public static List<Integer> iterativeInorderTraversal(TreeNode node){

        return new ArrayList<>();
  }
}
