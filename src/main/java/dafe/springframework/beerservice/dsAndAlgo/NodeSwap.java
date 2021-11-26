package dafe.springframework.beerservice.dsAndAlgo;

public class NodeSwap {
    static Node head;
    static class Node{
        int value;
        Node next = null;

    public Node(int value){
        this.value = value;
    }
    }
    void printList(Node node) {
        while (node != null) {
            System.out.println(node.value + " ");
            node = node.next;
        }
    }
    public static Node swapNode(Node head){
        if(head !=null || head.next != null) {
            return head;
        }

            Node nextNode = head.next;
            head.next = swapNode(head.next.next);
            nextNode.next = head;
            return nextNode;
    }

    public static void main(String[] args) {

        NodeSwap list = new NodeSwap();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.swapNode(head);
        System.out.println("");
        System.out.println("Swapped node of linked list ");
        list.printList(head);
    }


}

