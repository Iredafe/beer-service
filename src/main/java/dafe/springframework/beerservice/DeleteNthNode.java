package dafe.springframework.beerservice;

public class DeleteNthNode
{
    Node head;

    class Node{
        int val;
        Node next;
        Node(int d){
            val =d;
            next=null;
        }
    }

    public void printlist(){
        Node tNode = head;
        while(tNode!=null){
            System.out.println(tNode.val + " ");
            tNode = tNode.next;
        }
    }

    private void deleteNode(int key) {

        //first pointer will point to the head of the linked list
        Node firstPointer = head;
    }

    public static void main(String[] args) {

        DeleteNthNode llist = new DeleteNthNode();
        llist.add(7);
        llist.add(1);
        llist.add(2);
        llist.add(3);

        System.out.println("\nCreated Linked list is:");

        llist.printlist();
        int n = 1;
        llist.deleteNode(n);

        System.out.println("\nLinked List after Deletion is:");
        llist.printlist();

    }
}
