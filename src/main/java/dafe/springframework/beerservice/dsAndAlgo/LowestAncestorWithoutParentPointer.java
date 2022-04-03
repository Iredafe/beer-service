package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LowestAncestorWithoutParentPointer {

    static TreeNode root;

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }


    public TreeNode lowestCommonAncestorWIthoutParentPointer(TreeNode root, TreeNode first, TreeNode second){

        if(root == null) return root;

        Stack<TreeNode> stack = new Stack();
        Map<TreeNode, TreeNode> parent = new HashMap();

        parent.put(root, null);
        stack.push(root);

        while(!parent.containsKey(first) && !parent.containsKey(second)){

            TreeNode node = stack.pop();

            if(node.left!=null){
                parent.put(node.left, node);
                stack.push(node.left);
            }

            if(node.right!=null){
                parent.put(node.right, node);
                stack.push(node.right);
            }

        }



        return root;
    }


    //[3,5,1,6,2,0,8,null,null,7,4]

    public static void main(String[] args) {
        LowestAncestorWithoutParentPointer lowestAncestorWithoutParentPointer = new LowestAncestorWithoutParentPointer();
        lowestAncestorWithoutParentPointer.root = new TreeNode(3);
        lowestAncestorWithoutParentPointer.root.left = new TreeNode(5);
        lowestAncestorWithoutParentPointer.root.right = new TreeNode(1);
        lowestAncestorWithoutParentPointer.root.left.left = new TreeNode(6);
        lowestAncestorWithoutParentPointer.root.left.right = new TreeNode(2);
        lowestAncestorWithoutParentPointer.root.right.left = new TreeNode(0);
        lowestAncestorWithoutParentPointer.root.right.right = new TreeNode(8);
        lowestAncestorWithoutParentPointer.root.right.left.left = new TreeNode(7);
        lowestAncestorWithoutParentPointer.root.right.left.right = new TreeNode(4);
    }
    }
