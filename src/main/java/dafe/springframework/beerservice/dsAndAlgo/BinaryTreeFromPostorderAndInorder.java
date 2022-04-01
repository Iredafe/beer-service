package dafe.springframework.beerservice.dsAndAlgo;

public class BinaryTreeFromPostorderAndInorder {

    public TreeNode buildTree(int [] postoreder, int [] inorder){

        return arrayToTree(0, postoreder.length-1, postoreder);
    }
}
