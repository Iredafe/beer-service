package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;

public class FindSuccessor {
        BinaryTree parent;
        BinaryTree node;
    static class BinaryTree{
        int value;
        BinaryTree parent=null;
        BinaryTree left=null;
        BinaryTree right=null;
        public BinaryTree(int value){
            this.value = value;
        }
    }

    public static BinaryTree findSuccessor(BinaryTree tree, BinaryTree node){

        ArrayList<BinaryTree> inOrderTraversalOrder = new ArrayList<>();
        getInorderTraversalOrder(tree, inOrderTraversalOrder);

        for(int i=0; i< inOrderTraversalOrder.size(); i++){
            BinaryTree currentNode = inOrderTraversalOrder.get(i);
            if(currentNode != node) continue;
            if(i == inOrderTraversalOrder.size()-1) return null;
            return inOrderTraversalOrder.get(i+1);
        }
        return null;
    }

    static void getInorderTraversalOrder(BinaryTree tree, ArrayList<BinaryTree> order){
        if(tree == null) return;

        getInorderTraversalOrder(tree.left, order);
        order.add(tree);
        getInorderTraversalOrder(tree.right, order);

    }

    public static BinaryTree findSuccessor1(BinaryTree tree, BinaryTree node){
        if(node.right != null) return getLeftMostChild(node.right);
        return getRightMostParent(node);
    }



    public static void main(String [] args){

       FindSuccessor tree = new FindSuccessor();
        tree.parent = new BinaryTree(1);
        tree.parent.left = new BinaryTree(2);
        tree.parent.right = new BinaryTree(3);
        tree.parent.left.left = new BinaryTree(4);
        tree.parent.left.right = new BinaryTree(5);
        tree.parent.left.left.left = new BinaryTree(6);

        BinaryTree node = new BinaryTree(5);
    //System.out.println("This is the node's successor : " + findSuccessor(tree, node));
    }

}
