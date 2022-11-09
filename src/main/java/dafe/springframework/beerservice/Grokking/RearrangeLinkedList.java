package dafe.springframework.beerservice.Grokking;

import java.util.List;

public class RearrangeLinkedList {

    static class ListNode{
        int value;
        ListNode next;
        public ListNode(int value){
            this.value = value;
        }
    }

    private static ListNode reorder(ListNode head){
        if(head==null || head.next == null) return head;
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = new ListNode(12);
        reorder(head);
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}
