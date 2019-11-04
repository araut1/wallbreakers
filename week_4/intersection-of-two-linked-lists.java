/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> map= new HashSet<ListNode>();
        if(headA==null || headB==null){
            return null;
        }
        int countA=countElements(headA);
        int countB=countElements(headB);
        int diff=Math.abs(countA-countB);
        ListNode longNode=null;
        ListNode smallNode=null;
       if(countA>countB){
           longNode=headA;
           smallNode=headB;
       }else{
           longNode=headB;
           smallNode=headA;
       }
        for(int i=0;i<diff;i++){
            longNode=longNode.next;
        }
        while(smallNode!=null){
            if(smallNode==longNode) return smallNode;
            longNode=longNode.next;
            smallNode=smallNode.next;
        }
        return null;
    }
    private int countElements(ListNode node){
         int count=0;
         ListNode tmpB=node;
           while(tmpB!=null){
               tmpB=tmpB.next;
               count++;
           }
        return count;
    
      
    }
}
