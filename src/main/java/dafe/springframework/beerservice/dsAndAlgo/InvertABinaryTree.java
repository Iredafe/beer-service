package dafe.springframework.beerservice.dsAndAlgo;

public class InvertABinaryTree {
    static BinaryTree root;

    static class BinaryTree {
        int value;
        BinaryTree right;
        BinaryTree left;

        public BinaryTree(int value){
            this.value=value;
        }

        /* Helper function to test mirror(). Given a binary
           search tree, print out its data elements in
           increasing sorted order.*/

    }
    static void inOrder(BinaryTree tree)
    {
        if (tree == null)
            return;

        inOrder(tree.left);
        System.out.print(tree.value + " ");

        inOrder(tree.right);
    }

    public static BinaryTree invertbinaryTree(BinaryTree tree){


        return tree;
    }


    public static void main(String[] args) {

        InvertABinaryTree tree = new InvertABinaryTree();

        tree.root = new BinaryTree(1);
        tree.root.left = new BinaryTree(2);
        tree.root.right = new BinaryTree(3);
        tree.root.left.left = new BinaryTree(4);
        tree.root.left.right = new BinaryTree(5);
        tree.root.right.left = new BinaryTree(6);
        tree.root.right.right = new BinaryTree(7);
        tree.root.left.left.left = new BinaryTree(8);
        tree.root.left.left.right = new BinaryTree(9);

        tree.inOrder(root);
        System.out.println( "This is the inverted binary tree : " + tree.invertbinaryTree(root));



    }
}
