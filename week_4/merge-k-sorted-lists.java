/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
       

   public ListNode mergeKLists(ListNode[] lists) {



        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (ListNode head : lists) {

            while (head != null) {

                q.add(head.val);
                head = head.next;
            }
        }

        ListNode dummy = new ListNode((-1));
       ListNode head = dummy;

        while (!q.isEmpty()) {

            ListNode node = new ListNode((q.remove()));

            head.next = node;
            head = head.next;

        }


        return dummy.next;
    }

}
