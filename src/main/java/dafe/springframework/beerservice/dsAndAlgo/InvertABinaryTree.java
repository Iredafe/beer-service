package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayDeque;

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
    if(tree != null) {
        swap(tree);
        invertbinaryTree(tree.left);
        invertbinaryTree(tree.right);
    }
        return tree;
    }

    private static void swap(BinaryTree tree) {
        BinaryTree temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;
    }

    public static void invertBinaryTreeBFS(BinaryTree tree){

        ArrayDeque<BinaryTree> queue = new ArrayDeque<>();
        queue.addLast(tree);
        while(queue.size()>0){
            BinaryTree current = queue.pollFirst();
            swap(current);
            if(current.left != null) queue.addLast(current.left);
            if(current.right !=null) queue.addLast(current.right);
        }

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
