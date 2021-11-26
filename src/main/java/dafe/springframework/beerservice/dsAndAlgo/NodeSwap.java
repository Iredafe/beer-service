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
    void printList(ReverseLinkedList.Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
    public static Node swapNode(Node head){

        Node currentNode = head;
        if(head !=null || head.next != null){
            currentNode = head.next;
            head.next = swapNode(head.next.next);
            head.next.next = currentNode;
        }
        return head;
    }

    public static void main(String[] args) {

        NodeSwap list = new NodeSwap();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(5);
    }


}

