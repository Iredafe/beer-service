package dafe.springframework.beerservice.dsAndAlgo;

import java.util.List;

public class MinHeightBST {

    public static BST minHeightBST(List<Integer> array){

        return minHeightBSTHelper(array, 0, array.size()-1);
    }

    public static BST minHeightBSTHelper(List<Integer> array, int startIdx, int endIdx){
    if(endIdx< startIdx) return null;
    int mid = startIdx + endIdx/2;
    BST bst = new BST(array.get(mid));
    bst.left = minHeightBSTHelper(array, startIdx, mid-1);
    bst.right = minHeightBSTHelper(array, mid+1, endIdx);
        return bst;
    }

    static class BST{
        int value;
        BST left;
        BST right;

        public BST(int value){
            this.value=value;
            left=null;
            right=null;
        }
        public void insert(int value){
            if(value < this.value){
                if(left == null){
                    left = new BST(value);
                }else{
                    left.insert(value);
                }
            }else{
                if(right == null){
                    right = new BST(value);
                }else{
                    right.insert(value);
                }
            }
        }
    }


}
