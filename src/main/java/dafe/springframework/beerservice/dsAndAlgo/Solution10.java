package dafe.springframework.beerservice.dsAndAlgo;

        public class Solution10 {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }

        public static class ListNode {
                  int val;
                  ListNode next;
                  ListNode(int x) { val = x; }

        }

            public static void main(String[] args) {
            ListNode lnode = new ListNode(5);


            //    System.out.println("The new node : " + deleteNode());
            }
        }

