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
