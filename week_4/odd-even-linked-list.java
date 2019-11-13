/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
          if (head == null || head.next == null) {
            return head;
        }

        ListNode mark1 = head;
        ListNode mark2 = head.next;
        ListNode cur = head;
        ListNode nxt = head.next;

        while (nxt != null) {

            cur.next = nxt.next;
            cur = nxt;
            nxt = nxt.next;

        }

        cur = mark1;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = mark2;

        return head;

    }
}
