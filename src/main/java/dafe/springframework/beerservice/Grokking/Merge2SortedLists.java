package dafe.springframework.beerservice.Grokking;

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

    public static ListNode merge2ListsIteratively(ListNode first, ListNode second){

          ListNode dummy = new ListNode(0);
          ListNode prev = dummy;

          while (first!=null && second!=null){

              if(first.value <= second.value){
                  prev = first;
                  first = first.next;
              }else{
                  prev = first;
                  second = second.next;
              }
              prev = prev.next;
          }
          prev.next = first==null? second : first;
        return dummy.next;
      }

    public static void main(String[] args) {
        Merge2SortedLists node = new Merge2SortedLists();

    }
}
