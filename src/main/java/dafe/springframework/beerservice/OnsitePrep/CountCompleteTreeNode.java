package dafe.springframework.beerservice.OnsitePrep;

public class CountCompleteTreeNode {
    static BinaryTree root;
    static class BinaryTree{
        int value; BinaryTree left; BinaryTree right;

        public BinaryTree(int value){
            this.value = value;
        }
    }

    public static int computeDepth(BinaryTree node){
        int d = 0;
        while(node.left!=null){
            node = node.left;
            d++;
        }
        return d;
    }

    public static boolean exists(int depth, BinaryTree node, int index){
        int left = 0;
        int right = (int)Math.pow(2, depth) - 1;
        int pivot;
        for(int i=0; i<depth; i++){
            pivot = left + (right-left)/2;
            if(index <= pivot) node = node.left;
            else node = node.right;
        }
        return node !=null;
    }

    public static int countNodes(BinaryTree node){
        int depth = computeDepth(node);
        int left = 1;
        int right = (int)Math.pow(2, depth)-1;
        int pivot = left+(right-left)/2;
    }

    public static void main(String[] args) {
        CountCompleteTreeNode tree = new CountCompleteTreeNode();

        tree.root = new BinaryTree(1);
        tree.root.right = new BinaryTree(2);
        tree.root.left = new BinaryTree(3);
        tree.root.left.left= new BinaryTree(4);
        tree.root.left.right = new BinaryTree(5);
        tree.root.right.left = new BinaryTree(6);
    }
}
