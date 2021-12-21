package dafe.springframework.beerservice.dsAndAlgo;

import java.util.Stack;

public class CompareLeafTraversal {
    BinaryTree root;
    static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value){
            this.value=value;
        }
    }


    public static boolean compareLeafTraversal(BinaryTree tree1, BinaryTree tree2){

        Stack<BinaryTree> treeTraversalStack1 = new Stack<>();
        Stack<BinaryTree> treeTraversalStack2 = new Stack<>();

        treeTraversalStack1.push(tree1);
        treeTraversalStack2.push(tree2);

        while(treeTraversalStack1.size() >0 && treeTraversalStack2.size() > 0){
            BinaryTree leaf1 = getNextLeafNode(treeTraversalStack1);
            BinaryTree leaf2 = getNextLeafNode(treeTraversalStack2);

            if(leaf1.value != leaf2.value) return false;
        }

        return treeTraversalStack1.size()==0 && treeTraversalStack2.size()==0;
    }

    public static BinaryTree getNextLeafNode(Stack<BinaryTree> traversalStack){
        BinaryTree currentNode = traversalStack.pop();

        while(!isLeafNode(currentNode)){
            if(currentNode.right != null) traversalStack.push(currentNode.right);
            if(currentNode.left != null) traversalStack.push(currentNode.left);
            currentNode = traversalStack.pop();
        }

        return currentNode;
    }

    public static boolean isLeafNode(BinaryTree tree){
    return tree.left==null && tree.right==null;
    }


    public static void main(String[] args) {

        CompareLeafTraversal tree1 = new CompareLeafTraversal();
        CompareLeafTraversal tree2 = new CompareLeafTraversal();
        tree1.root = new BinaryTree(1);
        tree1.root.left = new BinaryTree(2);
        tree1.root.right = new BinaryTree(3);
        tree1.root.left.left = new BinaryTree(4);
        tree1.root.left.right = new BinaryTree(5);
        tree1.root.right.right = new BinaryTree(6);
        tree1.root.left.right.left = new BinaryTree(7);
        tree1.root.left.right.right = new BinaryTree(8);

        tree2.root = new BinaryTree(1);
        tree2.root.left = new BinaryTree(2);
        tree2.root.right = new BinaryTree(3);
        tree2.root.left.left = new BinaryTree(4);
        tree2.root.left.right = new BinaryTree(7);
        tree2.root.right.right = new BinaryTree(5);
        tree2.root.right.right.right = new BinaryTree(6);
        tree2.root.right.right.left = new BinaryTree(8);


        System.out.println("Leaf of tree 1 is same as leaf of tree 2 : " + compareLeafTraversal(tree1.root, tree2.root));
    }
}
