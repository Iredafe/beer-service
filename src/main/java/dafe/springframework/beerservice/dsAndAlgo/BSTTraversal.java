package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class BSTTraversal {

    public static List<Integer> InOrderTraversal(BST tree, List <Integer> array){
        if(tree.left!=null){
            InOrderTraversal(tree.left, array);
        }
        array.add(tree.value);

        if(tree.right != null){
            InOrderTraversal(tree.right, array);
        }
        return array;
    }
    static class BST{
        public int value;
        public BST left;
        public BST right;

        public BST(int value){
            this.value = value;
        }
    }
    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array){

        return new ArrayList<Integer>();
    }
}
