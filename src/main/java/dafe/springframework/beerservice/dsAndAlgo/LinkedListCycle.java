package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    static class Node{
        int value;
        Node head;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public static boolean isCycle(Node head){
        Set<Node> set = new HashSet<>();
        while(head!= null){
            if(set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }

        return false;
    }

}
