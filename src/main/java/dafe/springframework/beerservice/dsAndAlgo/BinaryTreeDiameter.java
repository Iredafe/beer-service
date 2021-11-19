package dafe.springframework.beerservice.dsAndAlgo;

public class BinaryTreeDiameter {
    static BinaryTree root;
    static class BinaryTree{
        int value; BinaryTree left; BinaryTree right;

        public BinaryTree(int value){
            this.value = value;
        }
    }

    public static int binaryTreeDiameter(BinaryTree tree){

        return 1;
    }

    public static void main(String[] args) {

        BinaryTreeDiameter tree = new BinaryTreeDiameter();

        tree.root = new BinaryTree(1);
        tree.root.right = new BinaryTree(2);
        tree.root.left = new BinaryTree(3);
        tree.root.left.left= new BinaryTree(7);
        tree.root.left.left.left= new BinaryTree(8);
        tree.root.left.left.left.left = new BinaryTree(9);
        tree.root.left.right = new BinaryTree(4);
        tree.root.left.right.right = new BinaryTree(5);
        tree.root.left.right.right.right = new BinaryTree(6);

        System.out.println( "The diameter of this binary tree is : " + tree.binaryTreeDiameter(root));

    }
}
