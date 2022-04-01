package dafe.springframework.beerservice.dsAndAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextRightPointersInEachNode {

    public TreeNode populateNext(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return root;
    }
}
