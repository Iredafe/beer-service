package dafe.springframework.beerservice.OnsitePrep;

import java.util.List;

public class RemoveNthNodeFromEndOfList {

    static class ListNode{
        int val;
        ListNode next;
        public ListNode (int val){
            this.val = val;
        }
    }

    public static ListNode removeNthNodeFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        int lenghtCount = 0;

        while(head != null){
            lenghtCount++;
            first = first.next;
        }

        lenghtCount -= n;
        first = dummy;

        while (lenghtCount>0){
            lenghtCount--;
            first = first.next;
        }

        first.next = first.next.next;
        return dummy.next;
    }
}
