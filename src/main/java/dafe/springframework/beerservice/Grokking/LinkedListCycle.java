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

    private boolean isCycle(ListNode head){

        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
    }
}
