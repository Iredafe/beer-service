package dafe.springframework.beerservice.Grokking;

import java.util.List;

public class StartOfLinkedListCycle {
    class ListNode{
        int value=0;
        ListNode next;

        public ListNode(int value){
            this.value = value;
        }
    }
    private static ListNode findCycleStart(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        int cycleLength = 0;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                cycleLength = getCycleLength(slow);
                break;
            }
        }
        return findStart(cycleLength);
    }
        private static int getCycleLength(ListNode slow){
            ListNode current = slow;

            return 0;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList cycle start: " +
                findCycleStart(head).value);

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList cycle start: " +
                findCycleStart(head).value);

        head.next.next.next.next.next.next = head;
        System.out.println("LinkedList cycle start: " +
                findCycleStart(head).value);
    }
}
