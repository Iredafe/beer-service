package dafe.springframework.beerservice.Grokking;

public class ReverseSublist {

    static class ListNode{
        int value;
        ListNode next;
        public ListNode(int value){
            this.value = value;
        }
    }

    public static ListNode reverse(ListNode head, int first, int last){
        if(first==last) return head;
    ListNode current = head, previous = null;
        for(int i=0; current!=null && i<first-1; i++){
            previous=current;
            current = current.next;
        }

        ListNode lastNodeOfFirstPart = previous;

        ListNode lastNodeOfSublist = current;

        ListNode next = null;

        for(int i=0; current!=null && i< first-last+1; i++ ){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        if(lastNodeOfSublist!=null){
            lastNodeOfFirstPart.next = previous;
        }else{
            head = previous;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = reverse(head, 2, 4);
        System.out.print("Nodes of the reversed LinkedList are: ");
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }

}
