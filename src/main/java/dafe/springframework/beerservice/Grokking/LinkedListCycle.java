package dafe.springframework.beerservice.Grokking;

import java.util.List;

public class LinkedListCycle {

    static class ListNode{
        int value;
        ListNode next;

        public ListNode (int value) {
            this.value = value;
        }
    }

    private static boolean hasCycle(ListNode head){
    ListNode slowPointer = head;
    ListNode fastPointer = head;


        while(fastPointer!= null && fastPointer.next!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(fastPointer==slowPointer) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
    }
}
