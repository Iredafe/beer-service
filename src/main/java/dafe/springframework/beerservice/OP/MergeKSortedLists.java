package dafe.springframework.beerservice.OP;

public class MergeKSortedLists {

    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode mergeTwoLists(ListNode first, ListNode second){

        ListNode answer = new ListNode(-1);
        ListNode previous = answer;

        while(first!=null && second!=null){
            if(first.val <= second.val){
                previous.next = first;
                first = first.next;
            }else{
                previous.next = second;
                second = second.next;
            }
            previous = previous.next;
        }
        previous.next = first == null ? second : first;
        return answer.next;
    }

    public static ListNode mergeKSortedLists(ListNode [] lists){
        if(lists.length == 1) return lists[0];
        if(lists.length == 0) return null;

        ListNode head = mergeTwoLists(lists[0], lists[1]);

        for (int i= 2; i<lists.length; i++){
            head = mergeTwoLists(head, lists[i]);
        }
        return head;
    }
}
