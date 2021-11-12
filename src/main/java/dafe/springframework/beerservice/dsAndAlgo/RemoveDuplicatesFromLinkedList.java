package dafe.springframework.beerservice.dsAndAlgo;

public class RemoveDuplicatesFromLinkedList {
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
        //another reference to head
        Node currentNode = head;

        //traverse list till the last node which will be null
        while(currentNode!=null){
            Node nextDistinctNode = currentNode.next;
            //compare current node with the next node and keep deleting them until it matches the current node data
            while(nextDistinctNode!=null && currentNode.value==nextDistinctNode.value){
                nextDistinctNode = nextDistinctNode.next;
                //remember that currentNode = head
                //remember that nextDistinctNode is currentNode.next or head.next
                //that means nextDistinctNode.next = currentNode.next.next or head.next.next
            }

            //set current node next to the next distinct element denoted by nextDistinctNode
            currentNode.next = nextDistinctNode;
            currentNode=currentNode.next;

        }
        return head;
    }
    // prints content of linked list
    static void printList(Node node){
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    // Driver Code
    public static void main(String[] args) {
        RemoveDuplicatesFromLinkedList list = new RemoveDuplicatesFromLinkedList();

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
