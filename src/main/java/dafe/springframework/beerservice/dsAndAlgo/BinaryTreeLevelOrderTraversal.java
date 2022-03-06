package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    static BinaryTree root;
     static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }

    public  static List<List<Integer>> levelOrder(BinaryTree root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<BinaryTree> queue = new LinkedList<>();

        if(root == null) return null;

        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> sublist = new ArrayList<>();
            int size = queue.size();
        for(int i=0; i < size; i++){
            BinaryTree node = queue.peek();
            if(node.left !=null) queue.offer(node.left);
            if(node.right !=null) queue.offer(node.right);

            sublist.add(queue.poll().value);
        }
            result.add(sublist);
        }
         return result;
    }

    public static void main(String[] args) {

         BinaryTreeLevelOrderTraversal tree = new BinaryTreeLevelOrderTraversal();

        tree.root = new BinaryTree(1);
        tree.root.left = new BinaryTree(2);
        tree.root.right = new BinaryTree(3);
        tree.root.left.left = new BinaryTree(4);
        tree.root.left.right = new BinaryTree(5);
        tree.root.right.left = new BinaryTree(6);
        tree.root.right.right=new BinaryTree(7);
        tree.root.left.left.left = new BinaryTree(8);
        tree.root.left.left.right = new BinaryTree(9);
        tree.root.left.right.left = new BinaryTree(10);

        System.out.println("Level order traversal result " + tree.levelOrder(tree.root));
    }
}
