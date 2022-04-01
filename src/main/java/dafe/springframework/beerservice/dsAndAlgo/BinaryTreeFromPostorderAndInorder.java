package dafe.springframework.beerservice.dsAndAlgo;

public class BinaryTreeFromPostorderAndInorder {

    public TreeNode buildTree(int [] postoreder, int [] inorder){

        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return arrayToTree(0, postoreder.length-1, postoreder);
    }

    private TreeNode arrayToTree(int i, int i1, int[] postoreder) {
    }
}
