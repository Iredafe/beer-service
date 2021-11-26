package dafe.springframework.beerservice.dsAndAlgo;

public class NodeSwap {

    static class Node{
        int value;
        Node next = null;

    public Node(int value){
        this.value = value;
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



}
