package dafe.springframework.beerservice.dsAndAlgo;

public class FindClosestValueOfBST {
    static BST root;
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
        //tree.value represents the current node
        else if(Math.abs(target-closest) > Math.abs(target-tree.value)){
            closest=tree.value;
        }else if(target< tree.value && tree.left!=null){
            return findClosestValueInBstRecursiveHelper(tree.left, target, closest);
        }else if(target>tree.value && tree.right!=null){
            return findClosestValueInBstRecursiveHelper(tree.right, target, closest);
        }
    return closest;
    }


    public static void main(String[] args) {

        FindClosestValueOfBST node = new FindClosestValueOfBST();
        node.root = new BST(10);
        node.root.left = new BST(5);
        node.root.right = new BST(15);
        node.root.left.left=new BST(2);
        node.root.left.right= new BST(5);
        node.root.right.left = new BST(13);
        node.root.right.right = new BST(22);
        node.root.left.left.left=new BST(1);
        node.root.right.left.right = new BST(14);


       int result = node.findClosestValueInBstRecursive(root, 14);
        System.out.println("The closest value in BST is : " + result);

    }
}
