package dafe.springframework.beerservice.Grokking;

class ListNode{
    LinkedListNode next;
    int value;

    public ListNode(int value){
        this.value = value;
    }
}
public class MiddleOfLinkedList {

    private static LinkedListNode findMiddle(LinkedListNode node){
        LinkedListNode fastPointer = node;
        LinkedListNode slowPointer = node;

        while (fastPointer!= null && fastPointer.next!=null){
            fastPointer = fastPointer.next.next;
            slowPointer= slowPointer.next;
        }

        return slowPointer;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(5);
        System.out.println("Middle Node: " + findMiddle(head).value);

        head.next.next.next.next.next = new LinkedListNode(6);
        System.out.println("Middle Node: " + findMiddle(head).value);

        head.next.next.next.next.next.next = new LinkedListNode(7);
        System.out.println("Middle Node: " + findMiddle(head).value);
    }
}
