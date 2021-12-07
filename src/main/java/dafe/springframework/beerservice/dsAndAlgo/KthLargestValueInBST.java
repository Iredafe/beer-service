package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class KthLargestValueInBST {
    static BST root;
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

    public static void main(String[] args) {

        KthLargestValueInBST tree = new KthLargestValueInBST();
        tree.root = new BST(15);
        tree.root.left = new BST(5);
        tree.root.right = new BST(20);
        tree.root.left.left = new BST(2);
        tree.root.left.right = new BST(5);
        tree.root.right.left = new BST(17);
        tree.root.right.right=new BST(22);
        tree.root.left.left.left = new BST(1);
        tree.root.left.left.right = new BST(5);

      int result =  tree.findKthLargestValueInBst(root, 3);
        System.out.println("The kth largest number in the BST is : " + result);
    }
}
