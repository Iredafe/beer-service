package dafe.springframework.beerservice.dsAndAlgo;

public class ReverseLinkedListAlgo {

    static class Linkedlist{
        Linkedlist next = null;
        int value;

        public Linkedlist(int value){
            this.value = value;
        }
    }

    public static Linkedlist reverseLinkedList(Linkedlist head){

        Linkedlist previousNode = null;
        Linkedlist currentNode = head;
        while(currentNode != null){
            Linkedlist nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
