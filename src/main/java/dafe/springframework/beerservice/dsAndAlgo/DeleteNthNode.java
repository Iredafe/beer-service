package dafe.springframework.beerservice.dsAndAlgo;

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

    private void push(int newData) {

        Node newNode = new Node(newData);
        newNode.next=head;
        head=newNode;
    }

    private void deleteNode(int key) {

        //first pointer will point to the head of the linked list
        Node firstPointer = head;

        //second pointer will point to the nth node from the beginning
        Node secondPointer = head;
        for(int i=0; i<key; i++){
            if(secondPointer == null){
                if(i==key-1)
                    head = head.next;
                return;
            }
            secondPointer=secondPointer.next;
        }
        //increment both pointers by one until second pointer reaches the end
        while (secondPointer.next!=null){
            firstPointer = firstPointer.next;
            secondPointer=secondPointer.next;
        }

        //first pointer must be pointing to the nth node from the end
        // by now so delete the node the firstPointer is pointing to

        firstPointer.next=firstPointer.next.next;
    }


    public static void main(String[] args) {

        DeleteNthNode llist = new DeleteNthNode();
        llist.push(7);
        llist.push(1);
        llist.push(2);
        llist.push(3);

        System.out.println("\nCreated Linked list is:");

        llist.printlist();
        int n = 1;
        llist.deleteNode(n);

        System.out.println("\nLinked List after Deletion is:");
        llist.printlist();

    }

}
