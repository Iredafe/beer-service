package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromPostorderAndInorder {
    static int postIdx;
    static Map<Integer, Integer>  map = new HashMap<>();
    public static TreeNode buildTree(int [] postoreder, int [] inorder){
        postIdx = postoreder.length-1;
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return arrayToTree(0, postoreder.length-1, postoreder);
    }

    private static TreeNode arrayToTree(int left, int right, int[] postorder) {
    if(left > right) return null;
        int rootVal = postorder[postIdx--];
        TreeNode tree = new TreeNode(rootVal);
        int index = map.get(rootVal);
        tree.right = arrayToTree(index+1, right, postorder);
        tree.left = arrayToTree(left, index-1, postorder);

        return tree;
    }

    public static void main(String[] args) {
        int [] postorder = {9,15,7,20,3};
        int [] inorder ={9,3,15,20,7};

        System.out.println("This is the binary tree from postorder and inorder arrays : " +
                buildTree(inorder, postorder));
    }
}
