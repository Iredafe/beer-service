package dafe.springframework.beerservice.dsAndAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextRightPointersInEachNode {

    public TreeNode populateNext(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        if(!queue.isEmpty()){
            int size = queue.size();
            TreeNode node = queue.poll();
            for(int i=0; i<size; i++){
                if(i<size-1) {
                    node.next = queue.peek();
                }
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);

            }
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
