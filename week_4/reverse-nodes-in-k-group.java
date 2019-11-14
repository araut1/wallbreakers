class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1) {
            return head;
        }
        // create new head;
        ListNode p = new ListNode(-1);
        p.next = head;
        head = p;
        
        // reverse every k nodes
        p = head;
        ListNode start = p.next, end = start, tmp = null, next = null;
        while (end != null) {
            int step = k;
            while (step > 1) {
                tmp = end;
                end = end.next;
             
                if (end == null) {
                    return head.next;
                }
                --step;
            }
          
            p.next = end;
            tmp.next = null;
          
            next = end.next;
         
            p = start;
         
            while (start != null) {
                tmp = start;
                start = start.next;
                tmp.next = end.next;
                end.next = tmp;
            }
   
            start = next;
            end = start;
        }
        return head.next;
    }
}
