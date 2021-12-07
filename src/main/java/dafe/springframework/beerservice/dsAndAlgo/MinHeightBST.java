package dafe.springframework.beerservice.dsAndAlgo;

import java.util.List;

public class MinHeightBST {

    public static BST minHeightBST(List<Integer> array){

        return minHeightBSTHelper(array, null, 0, array.size()-1);
    }

    public static BST minHeightBSTHelper(List<Integer> array, BST bst, int startIdx, int endIdx){


        return bst;
    }

    static class BST{
        int value;
        BST left;
        BST right;

        public BST(int value){
            this.value=value;
        }
    }
}
