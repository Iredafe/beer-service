package dafe.springframework.beerservice.dsAndAlgo;

import org.springframework.boot.actuate.endpoint.web.Link;

public class RemoveDuplicatesFromLinkedList {
    LinkedList head;
    public static class LinkedList{
        public int value;
        public LinkedList next;

        public LinkedList(int value){
            this.value=value;
            this.next = null;
        }
    }

    //utility function
    //insert a new node at the front of the list
    public void push(int new_value) {
        //allocate the node and put in the value
        LinkedList newNode = new LinkedList(new_value);

        //make next of new LinkedList node as head
        newNode.next = head;

        //move the head to point to the new node
    head = newNode;
    }

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList){

        LinkedList currentNode = linkedList;
        while(currentNode!=null){
            LinkedList nextDistinctNode = currentNode.next;
            while(nextDistinctNode.value ==currentNode.value && nextDistinctNode!=null){
                nextDistinctNode = nextDistinctNode.next;
            }
            currentNode.next = nextDistinctNode;
            currentNode=nextDistinctNode;

        }
        return linkedList;
    }
}
