package dafe.springframework.beerservice.dsAndAlgo;

public class MiddleOfLinkedList {
 Node head;
    static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public static int middleOfLinkedList(Node head){
        int index = 0;
        Node [] array = new Node[100];
        while(head!=null){
            array[index++] = head;
            head = head.next;
        }
        int mid = index/2;
        return array[mid].value;
    }

    public static int middleOfLL2Pointer(Node head){

        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.value;
    }

    public static void main(String[] args) {
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        middleOfLinkedList.head = new Node(1);
        middleOfLinkedList.head.next = new Node(2);
        middleOfLinkedList.head.next.next = new Node(3);
        middleOfLinkedList.head.next.next.next = new Node(4);
        middleOfLinkedList.head.next.next.next.next= new Node(5);

        System.out.println("This is the middle of the linkedlist : " + middleOfLinkedList(middleOfLinkedList.head));
    }
}
