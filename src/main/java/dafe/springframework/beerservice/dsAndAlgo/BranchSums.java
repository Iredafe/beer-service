package dafe.springframework.beerservice.dsAndAlgo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

public class BranchSums {

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
     if(node.left == null && node.right==null){
         sums.add(newRunningSum);
         return;
     }

     calculateBranchSums(node.left, newRunningSum, sums);
     calculateBranchSums(node.right, newRunningSum, sums);
    }

    public static void main(String[] args) {

    }
}
