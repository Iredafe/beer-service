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

    public static Node middleOfLinkedList(Node head){
        int index = 0;
        Node [] array = new Node[100];
        while(head.next!=null){
            array[index++] = head;
            head = head.next;
        }
        int mid = array.length/2;
        return array[mid];
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
