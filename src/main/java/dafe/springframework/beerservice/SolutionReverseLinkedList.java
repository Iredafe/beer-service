package dafe.springframework.beerservice;


    //create a class and a method to reverse linkedlist
public class SolutionReverseLinkedList {
        static ListNode head;
        //define singly linkedlist
       static class ListNode{
            int val;
            ListNode next;
            static ListNode head;

            ListNode(){}
            ListNode(int dafe){
                this.val = dafe;
                this.next = null;
            }
        }

        static ListNode reverseList(ListNode head){
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head=previous;

        return head;
    }

    void printList(ListNode node){
           while (node!=null){
               System.out.println("This is the data : " + node.val + " ");
               node = node.next;
           }
    }

        public static void main(String[] args) {
        SolutionReverseLinkedList list = new SolutionReverseLinkedList();
        list.head = new ListNode(9);
        list.head.next = new ListNode(3);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(89);
        list.head.next.next.next.next = new ListNode(32);
            System.out.println("This is the list before reversing" );
            list.printList(head);
            head = list.reverseList(head);

            System.out.println("This is the list after reversing " );
            list.printList(head);
        }

}
