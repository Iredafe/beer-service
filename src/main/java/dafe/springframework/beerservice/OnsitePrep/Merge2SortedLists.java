package dafe.springframework.beerservice.OnsitePrep;

public class Merge2SortedLists {

      static class ListNode{
        int value;
        ListNode next;
        ListNode previous;

        public ListNode(int value){
            this.value = value;
        }

        public static ListNode mergeTwoSortedLists(ListNode first, ListNode second){
            if(first == null) return second;
            else if(second == null) return first;
            else if(first.value <= second.value){
                first.next = mergeTwoSortedLists(first.next, second);
                return first;
            }else{
                second.next = mergeTwoSortedLists(first, second.next);
                return second;
            }
        }
    }

    public static ListNode merge2Lists(ListNode first, ListNode second){

    }
    public static void main(String[] args) {
        Merge2SortedLists node = new Merge2SortedLists();

    }
}
