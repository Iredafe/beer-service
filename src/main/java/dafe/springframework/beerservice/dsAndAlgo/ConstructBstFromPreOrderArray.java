package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConstructBstFromPreOrderArray {
   static Map<Integer, Integer> idxMap = new HashMap();
   static int preorder[];
   static int preIdx;
   public static void main(String[] args) {
        int [] preorder = {8,5,1,7,10,12};

        System.out.println("This is the constructed bst : " + bstFromPreorder(preorder));
    }

    private static TreeNode bstFromPreorder(int[] preorder) {
        int [] inorderArray = Arrays.copyOf(preorder, preorder.length);
        Arrays.sort(inorderArray);

        int idx = 0;
        for(Integer val : inorderArray){
            idxMap.put(val, idx++);
        }
        return helper(0, inorderArray.length);
    }

    private static TreeNode helper(int leftIndex, int rightIndex) {

       return null;
    }
}
