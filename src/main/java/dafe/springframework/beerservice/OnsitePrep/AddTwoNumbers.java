package dafe.springframework.beerservice.OnsitePrep;

import java.util.List;

public class AddTwoNumbers {

    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }

        public static ListNode addTwoNumbers(ListNode first, ListNode second){
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            ListNode p = first;
            ListNode q = second;

            while (p!=null && q!=null){
                int x = (p!=null ? p.val : 0);
                int y = (q!=null ? q.val : 0);
            }
        }
    }
}
