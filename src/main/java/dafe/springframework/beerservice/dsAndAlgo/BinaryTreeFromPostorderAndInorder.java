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

        int rootVal = postorder[postIdx--];
        TreeNode tree = new TreeNode(rootVal);
        int index = map.get(rootVal);
        tree.right = arrayToTree(index+1, right, postorder);
    }
}
