package dafe.springframework.beerservice.dsAndAlgo;

public class HeightBalancedBinaryTree {

    static class BinaryTree{
        int value; BinaryTree left, right;

        public BinaryTree(int value){
            this.value = value;
        }
    }

    public boolean heightBalancedTree(BinaryTree tree){

        return customHeight(tree) != -1;
    }


    public int customHeight(BinaryTree tree){
        if(tree == null) return 0;
        int leftHeight = customHeight(tree.left);
        if(leftHeight == -1) return -1;
        int rightHeight = customHeight(tree.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) +1;
    }
}
