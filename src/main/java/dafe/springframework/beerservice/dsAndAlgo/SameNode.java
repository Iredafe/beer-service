package dafe.springframework.beerservice.dsAndAlgo;

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

    public static void main(String[] args) {

        SameNode node1 = new SameNode();
        SameNode node2 = new SameNode();
        node1.root =  new BinaryTree(1);
        node1.root.left = new BinaryTree(2);
        node2.root.right = new BinaryTree(3);        node1.root =  new BinaryTree(1);
        node2.root.left = new BinaryTree(2);
        node2.root.right = new BinaryTree(3);
    }
}
