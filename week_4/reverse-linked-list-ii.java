/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
   

    public ListNode reverseBetween(ListNode head, int m, int n) {

        int count = 0;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode start = dummy;
        ListNode end = dummy;
        ListNode first = dummy;
        ListNode last = dummy;
        ListNode prv = dummy;
        ListNode nxt = dummy;

        ListNode cur = dummy;

        while (cur != null) {


            if (count == m - 1) {
                start = cur;
            }
            if (count == m) {
                first = cur;
            }
                       if (count == n) {
                last = cur;
            }
            count++;
            cur = cur.next;
        }

        end = last.next;
        cur = first;
        prv = end;


        while (cur != end) {

            nxt = cur.next;
            cur.next = prv;
            prv = cur;
            cur = nxt;

        }
        start.next = last;

        return dummy.next;
    }
}
