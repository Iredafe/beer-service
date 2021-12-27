package dafe.springframework.beerservice.dsAndAlgo;

import com.sun.source.tree.Tree;

public class HeightBalancedBinaryTree {
    private static BinaryTree root;
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

    static class TreeInfo{
        boolean isBalanced;
        int height;

        public TreeInfo(boolean isBalanced, int height){
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }

    public static TreeInfo getTreeInfo(BinaryTree tree){

    }

    public static boolean isHeightBalancedTree(BinaryTree tree){
        TreeInfo treeInfo = getTreeInfo(tree);
        return treeInfo.isBalanced;
    }

    public static void main(String[] args) {

        HeightBalancedBinaryTree tree = new HeightBalancedBinaryTree();
        tree.root = new BinaryTree(1);
        tree.root.left = new BinaryTree(2);
        tree.root.right = new BinaryTree(3);
        tree.root.left.left = new BinaryTree(4);
        tree.root.left.right = new BinaryTree(5);
        tree.root.right.right=new BinaryTree(6);
        tree.root.left.right.left = new BinaryTree(7);
        tree.root.left.right.right = new BinaryTree(8);

        System.out.println("Is the tree height balanced?  : " + tree.heightBalancedTree(root));

    }
}
