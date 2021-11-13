package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class NodeDepths {
    static BinaryTree root;
    public static class BinaryTree{
        int value; BinaryTree left, right;
        public BinaryTree(int value){
            this.value = value;
            this.left=null;
            this.right=null;
        }
    }

    public static int nodeDepth(BinaryTree root){
        return nodeDepthHelper(root, 0);
    }


    public static int nodeDepthHelper(BinaryTree node , int depth){
        if(node==null) return 0;
        return depth+ nodeDepthHelper(node.left , depth+1) + nodeDepthHelper(node.right,depth+1);
    }

    public static void main(String[] args) {
        NodeDepths tree = new NodeDepths();
        tree.root = new BinaryTree(1);
        tree.root.left= new BinaryTree(2);
        tree.root.right = new BinaryTree(3);
        tree.root.left.left = new BinaryTree(4);
        tree.root.left.right = new BinaryTree(5);
        tree.root.right.left = new BinaryTree(6);
        tree.root.right.right=new BinaryTree(7);
        tree.root.left.left.left = new BinaryTree(8);
        tree.root.left.left.right = new BinaryTree(9);

        System.out.println("The maximum depth of the binary tree is : " + tree.nodeDepth(root));
    }
}
