package dafe.springframework.beerservice.Grokking;

import java.util.List;

 class ListNode{
    ListNode next;
    int value;

    public ListNode(int value){
        this.value = value;
    }
}
public class MiddleOfLinkedList {

    private static ListNode findMiddle(ListNode node){
        ListNode fastPointer = node;
        ListNode slowPointer = node;

        while (fastPointer!= null && fastPointer.next!=null){
            fastPointer = fastPointer.next.next;
            slowPointer= slowPointer.next;
        }

        return slowPointer;
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
