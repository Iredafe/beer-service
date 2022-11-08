package dafe.springframework.beerservice.Grokking;

public class MiddleOfLinkedList {

    static class ListNode{
        int head;
        ListNode next;

        public ListNode(int head){
            this.head = head;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Middle Node: " + findMiddle(head).value);

        head.next.next.next.next.next = new ListNode(6);
        System.out.println("Middle Node: " + findMiddle(head).value);

        head.next.next.next.next.next.next = new ListNode(7);
        System.out.println("Middle Node: " + findMiddle(head).value);
    }
}
