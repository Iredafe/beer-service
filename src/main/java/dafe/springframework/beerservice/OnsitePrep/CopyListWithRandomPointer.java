package dafe.springframework.beerservice.OnsitePrep;

import java.util.HashMap;

public class CopyListWithRandomPointer {

    static class Node{
        int val;
        Node next;
        Node random;

        public Node(int val){
            this.val=val;
        }
    }

    static HashMap<Node, Node> visitedHash = new HashMap<>();

    public static Node copyListWithRandomPointer(Node head){
        if(head == null){
            return null;
        }

        if(visitedHash.containsKey(head)){
            return visitedHash.get(head);
        }

        Node node = new Node(head.val);

        visitedHash.put(head, node);

        node.next = copyListWithRandomPointer(head.next);
        node.random = copyListWithRandomPointer(head.random);
        return node;
    }

    public static void main(String[] args) {

    }
}
