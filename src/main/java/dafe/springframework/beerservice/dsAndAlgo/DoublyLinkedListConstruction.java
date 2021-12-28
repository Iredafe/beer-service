package dafe.springframework.beerservice.dsAndAlgo;

public class DoublyLinkedListConstruction {

    static class Node{
        int value;
        Node prev;
        Node next;

        public Node(int value){
            this.value=value;
        }
    }

    static class DoublyLinkedList{
        Node head;
        Node tail;

        public void setHead(Node node){

        }

        public void setTail(Node node){

        }

        public void insertBefore(Node node, Node nodeToInsert){

        }

        public void insertAfter(Node node, Node nodeToInsert){

        }

        public void insertAtPosition(int position, Node nodeToInsert){

        }

        public void removeNodesWithValue(int value){

        }

        public void remove(Node node){
        if(node == head) head = head.next;
        if(node == tail) tail = tail.prev;

        removeNodeBindings(node);
        }

        public boolean containsNodeWithValue(int value){
            return false;
        }

    }
}
