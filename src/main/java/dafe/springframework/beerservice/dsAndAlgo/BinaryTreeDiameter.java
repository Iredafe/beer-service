package dafe.springframework.beerservice.dsAndAlgo;

public class BinaryTreeDiameter {
    static BinaryTree root;
    static class BinaryTree{
        int value; BinaryTree left; BinaryTree right;

        public BinaryTree(int value){
            this.value = value;
        }
    }

    static class TreeInfo{
        int diameter;
        int height;

        public TreeInfo(int diameter,int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static TreeInfo getTreeInfo(BinaryTree tree){
        if(tree == null) return new TreeInfo(0,0);

        TreeInfo leftTreeInfo = getTreeInfo(tree.left);
        TreeInfo rightTreeInfo = getTreeInfo(tree.right);

        int longestPathThroughRoot = leftTreeInfo.height + rightTreeInfo.height;
        int maximumDiameter = (leftTreeInfo.diameter + rightTreeInfo.diameter);
        int currentDiameter = Math.max(longestPathThroughRoot, maximumDiameter);
        int currentHeight = 1+Math.max(leftTreeInfo.height , rightTreeInfo.height);
        return new TreeInfo(currentDiameter, currentHeight);
    }
    public static int binaryTreeDiameter(BinaryTree tree){
        return getTreeInfo(tree).diameter;
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
