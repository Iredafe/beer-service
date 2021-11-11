package dafe.springframework.beerservice.dsAndAlgo;

import org.springframework.boot.actuate.endpoint.web.Link;

import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {
    LinkedL head;
    public static class LinkedL{
        public int value;
        public LinkedL next;

        public LinkedL(int value){
            this.value=value;
            this.next = null;
        }
    }

    //utility function
    //insert a new node at the front of the list
    public void push(int new_value) {
        //allocate the node and put in the value
        LinkedL newNode = new LinkedL(new_value);

        //make next of new LinkedList node as head
        newNode.next = head;

        //move the head to point to the new node
    head = newNode;
    }

    //function to print linkedlist
    void printList(){
        LinkedL temp = head;
        while(temp!=null){
            System.out.println(temp.value + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static LinkedL removeDuplicatesFromLinkedList(LinkedL linkedList){

        LinkedL currentNode = linkedList;
        while(currentNode!=null){
            LinkedL nextDistinctNode = currentNode.next;
            while(nextDistinctNode.value ==currentNode.value && nextDistinctNode!=null){
                nextDistinctNode = nextDistinctNode.next;
            }
            currentNode.next = nextDistinctNode;
            currentNode=nextDistinctNode;

        }
        return linkedList;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

    }
}
