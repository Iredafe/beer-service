package dafe.springframework.beerservice.dsAndAlgo;

public class FindSuccessor {
        BinaryTree parent;
    static class BinaryTree{
        int value;
        BinaryTree parent=null;
        BinaryTree left=null;
        BinaryTree right=null;
        public BinaryTree(int value){
            this.value = value;
        }
    }

    public static void main(String [] args){

       FindSuccessor tree = new FindSuccessor();
        tree.parent = new BinaryTree(1);
        tree.parent.left = new BinaryTree(2);
        tree.parent.right = new BinaryTree(3);
        tree.parent.left.left = new BinaryTree(4);
        tree.parent.left.right = new BinaryTree(5);
        tree.parent.left.left.left = new BinaryTree(6);
        }

}
