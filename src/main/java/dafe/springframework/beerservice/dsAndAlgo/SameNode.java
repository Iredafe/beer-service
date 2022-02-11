package dafe.springframework.beerservice.dsAndAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class SameNode {

    private static BinaryTree root;

    static class BinaryTree{
    int value;
    BinaryTree left=null;
    BinaryTree right=null;

    public BinaryTree(int value){
        this.value = value;
    }
    }

    public static boolean isSameNode(BinaryTree firstTree, BinaryTree secondTree){
        if(firstTree == null && secondTree == null) return true;
        if(firstTree == null || secondTree==null) return false;
        if(firstTree.value != secondTree.value) return false;

        return isSameNode(firstTree.left, secondTree.left) && isSameNode(firstTree.right, secondTree.right);
    }

    public static boolean isSameNodeIteratively(BinaryTree first, BinaryTree second){
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.offer(first);
        queue.offer(second);

        while(!queue.isEmpty()){
            first= queue.poll();
            second= queue.poll();
            if(first == null && second == null) continue;
            if(second== null || first == null) return false;
            if(first.value != second.value) return false;

            queue.offer(first.left);
            queue.offer(second.left);
            queue.offer(first.right);
            queue.offer(second.right);

        }
        return true;
    }
    public static void main(String[] args) {

        SameNode node1 = new SameNode();
        SameNode node2 = new SameNode();
        node1.root =  new BinaryTree(1);
        node1.root.left = new BinaryTree(2);
        node1.root.right = new BinaryTree(3);
        node2.root =  new BinaryTree(1);
        node2.root.left = new BinaryTree(2);
        node2.root.right = new BinaryTree(3);

        System.out.println("These 2 nodes are the same : " );
    }
}
