package dafe.springframework.beerservice.dsAndAlgo;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    Node head;
    static class Node{
        int value;
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

    public static Node isCycle2(Node head){
        Set<Node> set = new HashSet<>();
        while(head!= null){
            if(set.contains(head)) return head;
            set.add(head);
            head = head.next;
        }

        return null;
    }

    public static boolean isACycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public static Node findCycle(Node head){
        if(head == null) return null;
        Node firstPointer = head;
        Node secondPointer = getIntersection(head);
        return null;
    }

    public static Node getIntersection(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return slow;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        linkedListCycle.head = new Node(3);
        linkedListCycle.head.next = new Node(2);
        linkedListCycle.head.next.next = new Node(0);
        linkedListCycle.head.next.next.next = new Node(-4);

        System.out.println("Is this node a cycle : " + isCycle(linkedListCycle.head));
    }
}
