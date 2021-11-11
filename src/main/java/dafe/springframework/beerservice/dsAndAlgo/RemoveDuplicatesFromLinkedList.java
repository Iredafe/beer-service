package dafe.springframework.beerservice.dsAndAlgo;

import org.springframework.boot.actuate.endpoint.web.Link;

public class RemoveDuplicatesFromLinkedList {

    public static class LinkedList{
        public int value;
        public LinkedList next;

        public LinkedList(int value){
            this.value=value;
            this.next = null;
        }
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
