package dafe.springframework.beerservice.dsAndAlgo;

public class BSTFromInorderAndPreorder {

    public static void main(String[] args) {
        int [] preorder = {3,9,20,15,7};
        int [] inorder = {9,3,15,20,7};

        System.out.println("This is the binary tree constructed from inorder and preorder arrays : "
                + arraysToTree(preorder, inorder));
    }
}
