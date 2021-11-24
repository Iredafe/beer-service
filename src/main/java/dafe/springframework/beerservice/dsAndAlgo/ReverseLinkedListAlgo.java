package dafe.springframework.beerservice.dsAndAlgo;

public class ReverseLinkedListAlgo {
    static Linkedlist head;
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

    public static void main(String[] args) {

        ReverseLinkedListAlgo list = new ReverseLinkedListAlgo();
        list.head = new ReverseLinkedListAlgo.Linkedlist(85);
        list.head.next = new ReverseLinkedListAlgo.Linkedlist(15);
        list.head.next.next = new ReverseLinkedListAlgo.Linkedlist(4);
        list.head.next.next.next = new ReverseLinkedListAlgo.Linkedlist(20);
        list.head.next.next.next.next = new ReverseLinkedListAlgo.Linkedlist(5);

        System.out.println("The reversed linked list is : " + list.reverseLinkedList(head));
    }
}
