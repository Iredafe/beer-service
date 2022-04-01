package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromPostorderAndInorder {
    static int postIdx;
    static Map<Integer, Integer>  map = new HashMap<>();
    public static TreeNode buildTree(int [] postoreder, int [] inorder){
       postIdx = 0;
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return arrayToTree(0, postoreder.length-1, postoreder);
    }

    private static TreeNode arrayToTree(int left, int right, int[] postoreder) {
    }
}
