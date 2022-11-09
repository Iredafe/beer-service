package dafe.springframework.beerservice.Grokking;

public class RearrangeLinkedList {

    static class ListNode{
        int value;
        ListNode next;
        public ListNode(int value){
            this.value = value;
        }
    }

    private static void reorder(ListNode head){
    if(head==null || head.next == null) return;

        ListNode fast=head;
        ListNode slow=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode secondHalfHead = reverse(slow);
        ListNode firstHalfHead = head;

        while (firstHalfHead!=null && secondHalfHead!=null){
            ListNode temp = firstHalfHead.next;
            firstHalfHead.next = secondHalfHead;
            firstHalfHead=temp;

            temp = secondHalfHead.next;
            secondHalfHead.next = firstHalfHead;
            secondHalfHead = temp;
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

    private static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode tempNext;
        ListNode previous = null;

        while(current!=null){
            tempNext = current.next;
            current.next  = previous;
            previous = current;
            current = tempNext;
        }
        return previous;
    }
}
