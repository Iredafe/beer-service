package dafe.springframework.beerservice.dsAndAlgo;

public class FindClosestValueOfBST {
    static BST tree;
    static class BST{
        public int value;
        BST left, right;

        public BST(int value){
            this.value = value;
        }
    }
    public static int findClosestValueInBstRecursive(BST tree, int target){

        return findClosestValueInBstRecursiveHelper(tree, target, tree.value);
         }

    public static int findClosestValueInBstRecursiveHelper(BST tree, int target, int closest){
        if(tree == null) return closest;
        else if(Math.abs(target-closest) > Math.abs(target-tree.value)){
            closest=tree.value;
        }else if(target< tree.value && tree.left!=null){
            return findClosestValueInBstRecursiveHelper(tree.left, target, closest);
        }else if(target>tree.value && tree.right!=null){
            return findClosestValueInBstRecursiveHelper(tree.right, target, closest);
        }
    return closest;
    }

}
