package dafe.springframework.beerservice;

public class Solution3 {
        static Node head;

        static class Node {
            int data;
            Node next;

            Node(int dafe) {
                this.data = dafe;
                this.next = null;
            }
        }
            Node reverse(Node node){
                Node previous = null;
                Node current = node;
                Node next = null;

                while(current!=null){
                    next = current.next;
                    current.next = previous;
                    previous=current;
                    current = next;
                }
                node = previous;
                return  node;
            }
        void printList(Node node){
        while(node != null){
            System.out.println(node.data + " ");
            node=node.next;
        }
        }

    public static void main(String[] args) {
        Solution3 list = new Solution3();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

}
