package dafe.springframework.beerservice.dsAndAlgo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReconstructBST {

    public static class BST{
        int value;
        BST left = null;
        BST right = null;

        public BST(int value){
            this.value = value;
        }

    }

    public static BST reconstructBST(List<Integer> preOrderTraversalValues){
        if(preOrderTraversalValues.size()==0) return null;
        int currentValue = preOrderTraversalValues.get(0);
        //initialize the right index of subtree with default value
        int rightIdxOfSubTree = preOrderTraversalValues.size();
        //identify the rightIndex
        for(int idx=1; idx< preOrderTraversalValues.size(); idx++){
            int value = preOrderTraversalValues.get(idx);
            if(value>=currentValue){
                rightIdxOfSubTree = idx;
                break;
            }
        }

        BST bst = new BST(currentValue);
        bst.left = reconstructBST(preOrderTraversalValues.subList(1, rightIdxOfSubTree));
        bst.right = reconstructBST(preOrderTraversalValues.subList(rightIdxOfSubTree, preOrderTraversalValues.size()));

        return bst;
    }

    public static void main(String[] args) {
        ArrayList <Integer> preOrderTraversalValues = new ArrayList<>(Arrays.asList(10, 4, 2, 1, 5, 17, 19, 18));

        System.out.println("This is the reconstructed BST : " + reconstructBST(preOrderTraversalValues));

    }

}
