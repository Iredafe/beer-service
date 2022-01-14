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
            if(head == null){
                head = node;
                tail = node;
                return;
            }
            insertBefore(head, node);
        }

        public void setTail(Node node){
            if(tail==null){
                setHead(node);
                return;
            }
            insertAfter(tail, node);
        }

        public void insertBefore(Node node, Node nodeToInsert){
            if(nodeToInsert == head || nodeToInsert==tail) return;
            remove(nodeToInsert);
        }

        public void insertAfter(Node node, Node nodeToInsert){

        }

        public void insertAtPosition(int position, Node nodeToInsert){

        }

        public void removeNodesWithValue(int value){
            Node node = head;
            while (node!=null){
                Node nodeToRemove = node;
                node = node.next;
                if(nodeToRemove.value == value) remove(nodeToRemove);
            }
        }

        public void remove(Node node){
        if(node == head) head = head.next;
        if(node == tail) tail = tail.prev;

        removeNodeBindings(node);
        }

        public void removeNodeBindings(Node node){

        }

        public boolean containsNodeWithValue(int value){
            return false;
        }

    }
}
