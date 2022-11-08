package dafe.springframework.beerservice.Grokking;

 class LinkedListNode {
    int value;
    LinkedListNode next;

    public LinkedListNode(int value){
        this.value = value;
    }
}
 public class PalindromeLinkedList {

    private static boolean isPalindrome(LinkedListNode head){

        if(head==null || head.next == null) return true;
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedListNode secondHalfNodeHead = reverseLinkedList(slow);
        LinkedListNode copySecondHalfNodeHead = secondHalfNodeHead;

        while(head!=null && secondHalfNodeHead!=null){
            if(head.next!=secondHalfNodeHead.next){
                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(2);
        head.next = new LinkedListNode(4);
        head.next.next = new LinkedListNode(6);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(2);
        System.out.println("Is palindrome: " + isPalindrome(head));

        head.next.next.next.next.next = new LinkedListNode(2);
        System.out.println("Is palindrome: " + isPalindrome(head));
    }
}
