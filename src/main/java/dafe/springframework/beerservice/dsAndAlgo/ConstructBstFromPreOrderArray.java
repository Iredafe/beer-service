package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConstructBstFromPreOrderArray {
   static Map<Integer, Integer> idxMap = new HashMap();
   static int[] preorder;
   static int preIdx=0;
   public static void main(String[] args) {
        int [] preorder = {8,5,1,7,10,12};

        System.out.println("This is the constructed bst : " + bstFromPreorder(preorder).toString());
    }

    private static TreeNode bstFromPreorder(int[] preorder) {
       ConstructBstFromPreOrderArray.preorder = preorder;
        int [] inorderArray = Arrays.copyOf(preorder, preorder.length);
        Arrays.sort(inorderArray);

        int idx = 0;
        for(Integer val : inorderArray){
            idxMap.put(val, idx++);
        }
        return helper(0, inorderArray.length);
    }

    private static TreeNode helper(int leftIndex, int rightIndex) {
        if(leftIndex == rightIndex) return null;

        int rootVal = preorder[preIdx];
        TreeNode treeNode = new TreeNode(rootVal);

        int index = idxMap.get(rootVal);
        preIdx++;
        treeNode.left = helper(leftIndex, index);
        treeNode.right = helper(index+1, rightIndex);

       return treeNode;
    }
}
