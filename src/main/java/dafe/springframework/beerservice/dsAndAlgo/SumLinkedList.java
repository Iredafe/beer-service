package dafe.springframework.beerservice.dsAndAlgo;

public class SumLinkedList {
    Node head;
    static class Node {
        int value;
        Node next;
        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public static Node sumLinkedList(Node firstNode, Node secondNode){

        Node dummy = new Node(0);
        Node currentNode = dummy;
        int carry = 0;

        Node nodeOne = firstNode;
        Node nodeTwo = secondNode;

        while (nodeOne!=null || nodeTwo!=null || carry!=0){
            int valueOne = (nodeOne!=null) ? nodeOne.value:0;
            int valueTwo = (nodeTwo!=null) ? nodeTwo.value:0;
            int sumOfValues = valueOne + valueTwo;

            int newValue = sumOfValues%10;
            Node newNode = new Node(newValue);
            currentNode = newNode;

            carry= sumOfValues/10;
            nodeOne = (nodeOne!=null) ? nodeOne.next:null;
            nodeTwo = (nodeTwo!=null) ? nodeTwo.next:null;
        }
        return dummy.next;
    }
}
