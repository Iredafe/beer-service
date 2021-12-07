package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class KthLargestValueInBST {

    static class BST{
        int value;
        BST left;
        BST right;

        public BST(int value){
            this.value = value;
        }
    }

    public static int findKthLargestValueInBst(BST tree, int k){
        ArrayList<Integer> sortedArray = new ArrayList<>();
        inOrderTraversal(tree, sortedArray);
        return sortedArray.get(sortedArray.size()-k);
    }

    public static void inOrderTraversal(BST tree, ArrayList<Integer> array){
        if(tree == null) return;
        inOrderTraversal(tree.left, array);
        array.add(tree.value);
        inOrderTraversal(tree.right, array);
    }
}
