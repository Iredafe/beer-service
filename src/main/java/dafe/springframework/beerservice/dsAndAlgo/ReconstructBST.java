package dafe.springframework.beerservice.dsAndAlgo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;

public class ReconstructBST {

    public static class BST{
        int value;
        BST left = null;
        BST right = null;

        public BST(int value){
            this.value = value;
        }

    }

    public static BST reconstructBST(ArrayList<Integer> preOrderTraversalValues){


        return new BST(0);
    }

    public static void main(String[] args) {
        ArrayList <Integer> preOrderTraversalValues = new ArrayList<>(Arrays.asList(10, 4, 2, 1, 5, 17, 19, 18));

        System.out.println("This is the reconstructed BST : " + reconstructBST(preOrderTraversalValues));

    }

}
