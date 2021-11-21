package dafe.springframework.beerservice.dsAndAlgo;

public class ValidateBST {
    static BST root;
    static class BST{
        int value; BST left; BST right;
        public BST(int value){
            this.value = value;
        }
    }



    public static boolean validateBST(BST tree){

        return validateBSTHelper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validateBSTHelper(BST tree, int minValue, int maxValue){

        if(tree.value < minValue || tree.value >=maxValue ) return false;
        if(tree.left != null && !validateBSTHelper(tree.left, minValue, tree.value)) return false;
        if(tree.right !=null && !validateBSTHelper(tree.right, tree.value, maxValue)) return false;

        return true;
    }
    public static void main(String[] args){

        ValidateBST tree = new ValidateBST();

        tree.root = new BST(10);
        tree.root.left = new BST(5);
        tree.root.right = new BST(15);
        tree.root.left.left = new BST(2);
        tree.root.left.right = new BST(5);
        tree.root.right.left = new BST(13);
        tree.root.right.right = new BST(22);
        tree.root.left.left.left = new BST(1);
        tree.root.right.left.right = new BST(14);

        System.out.println(" This BST is valid : " + tree.validateBST(root));
    }
}
