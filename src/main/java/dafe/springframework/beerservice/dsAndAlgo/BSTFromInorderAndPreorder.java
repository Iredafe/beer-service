package dafe.springframework.beerservice.dsAndAlgo;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class BSTFromInorderAndPreorder {
   static Map<Integer, Integer> map;
   static int preIdx;

    private static TreeNode arraysToTree(int left, int right, int[] preorder) {
        if(left > right) return null;

        int rootVal = preorder[preIdx++];
        TreeNode root = new TreeNode(rootVal);
        int index = map.get(rootVal);

        root.left = arraysToTree(left, index-1, preorder);
        root.right = arraysToTree(index+1, right, preorder);
        return root;
    }

    private static TreeNode buildTree(int preorder[], int [] inorder){
        map = new HashMap();
        preIdx = 0;

        for(int i=0; i< inorder.length; i++){
            map.put(inorder[i], i);
        }
        return arraysToTree(0, preorder.length-1, inorder);
    }

    public static void main(String[] args) {
        int [] preorder = {3,9,20,15,7};
        int [] inorder = {9,3,15,20,7};

        System.out.println("This is the binary tree constructed from inorder and preorder arrays : "
                + buildTree( preorder, inorder));
    }


}
