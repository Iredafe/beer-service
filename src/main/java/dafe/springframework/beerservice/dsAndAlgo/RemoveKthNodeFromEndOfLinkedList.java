package dafe.springframework.beerservice.dsAndAlgo;

public class RemoveKthNodeFromEndOfLinkedList {

    static class Node{
        int value;
        Node next =null;
        public Node(int value){
            this.value=value;
        }
    }
    public static void removeKthNode(Node head, int k){

        int counter =1;
        Node first =head;
        Node second = head;

        while(counter<=k){
            second= second.next;
            counter++;
        }
        if(second == null){
            head.value = head.next.value;
            head.next = head.next.next;
        }

        while(second!=null){
            second = second.next;
            first = first.next;
        }

        first.next = first.next.next;
    }
}
