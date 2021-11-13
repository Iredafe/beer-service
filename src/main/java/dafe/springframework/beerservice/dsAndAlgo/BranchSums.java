package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    static BinaryTree root;
    public static class BinaryTree{
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
    }

    public static List<Integer> branchSums(BinaryTree root){
    List<Integer> sums = new ArrayList<>();
    calculateBranchSums(root, 0, sums);
        return sums;
    }

    private static void calculateBranchSums(BinaryTree node, int runningSum, List<Integer> sums) {
     if(node==null) return;;
     int newRunningSum = runningSum + node.value;
     //check if the left and right nodes has no children, add the sum at the leaf nodes to the list
     if(node.left == null && node.right==null){
         sums.add(newRunningSum);
         return;
     }

     //but if the nodes have children, calculate the sum recursively
     calculateBranchSums(node.left, newRunningSum, sums);
     calculateBranchSums(node.right, newRunningSum, sums);
    }

    public static void main(String[] args) {
        System.out.println("The branch sum is : ");


      BranchSums tree = new BranchSums();
      tree.root = new BinaryTree(1);
      tree.root.left = new BinaryTree(2);
      tree.root.right = new BinaryTree(3);
      tree.root.left.left = new BinaryTree(4);
      tree.root.left.right = new BinaryTree(5);
      tree.root.right.left = new BinaryTree(6);
      tree.root.right.right=new BinaryTree(7);






    }
}
