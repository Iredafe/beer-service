package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class NodeDepths {

    public static class BinaryTree{
        int value; BinaryTree left, right;
        public BinaryTree(int value){
            this.value = value;
            this.left=null;
            this.right=null;
        }
    }

    public static int NodeDepth(BinaryTree root){
        return nodeDepthHelper(root, 0);
    }


    public static int nodeDepthHelper(BinaryTree node , int depth){
        if(node==null) return 0;
        return depth+ nodeDepthHelper(node.left , depth+1) + nodeDepthHelper(node.right,depth+1);
    }
}
