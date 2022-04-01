package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromPostorderAndInorder {

    static Map<Integer, Integer> map;
    public static TreeNode buildTree(int [] postoreder, int [] inorder){
        map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return arrayToTree(0, postoreder.length-1, postoreder);
    }

    private static TreeNode arrayToTree(int i, int i1, int[] postoreder) {
    }
}
