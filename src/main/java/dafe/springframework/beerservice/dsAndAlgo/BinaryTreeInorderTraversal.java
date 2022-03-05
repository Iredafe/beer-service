package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        Stack<TreeNode> stack = new Stack();
        List<Integer> array = new ArrayList<>();

        TreeNode current = node;
        while(current!=null || !stack.isEmpty()){

        }

        return array;
  }
}
