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

    private static void reorder(ListNode head){

        ListNode fast=head;
        ListNode slow=head;

        while (fast!=null && slow!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode secondHalfHead = reverse(slow);
        ListNode firstHalfHead = head;

        while (firstHalfHead!=null && secondHalfHead!=null){
            ListNode temp = firstHalfHead.next;
            firstHalfHead.next = secondHalfHead;
            secondHalfHead=temp;

            temp = secondHalfHead.next;
            secondHalfHead.next = firstHalfHead;
            firstHalfHead = temp;
        }

        if(firstHalfHead!=null){
            firstHalfHead.next = null;
        }
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
