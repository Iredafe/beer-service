package dafe.springframework.beerservice.dsAndAlgo;

public class LinkedList{
    static Node head;
    static class  Node{
        int value;
        Node next;
    Node(int value){
            this.value=value;
            this.next = null;
        }
    }

    static Node removeDuplicatesFromLinkedList(Node head){
        Node currentNode = head;
        while(currentNode!=null){
            Node nextDistinctNode = currentNode.next;
            while(nextDistinctNode!=null && nextDistinctNode.value ==currentNode.value){
                nextDistinctNode = nextDistinctNode.next;
            }
            currentNode.next = nextDistinctNode;
            currentNode=nextDistinctNode;

        }
        return head;
    }

    public static void push(int new_value){
        Node new_node = new Node(new_value);
        new_node.next = head;
        head = new_node;
    }

    static void printList(Node node){
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(20);
        list.head.next = new Node(13);
        list.head.next.next = new Node(13);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(20);
        System.out.println("Given Linked list");
        list.printList(head);
        System.out.println(" ");
        list.removeDuplicatesFromLinkedList(head);
        System.out.println("This is the linked list without duplicates : " );
        list.printList(head);

     }
}
