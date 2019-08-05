/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode l = new ListNode(0);
        ListNode dumHead = l;
        
        while (l1 != null && l2 != null) {
            
            if (l1.val < l2.val){
                l.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                l.next = new ListNode(l2.val);
                l2 = l2.next;
            }
 
            l = l.next;
        }
        
        if (l1 != null) l.next = l1;
        
        if (l2 != null) l.next = l2;
        

        return dumHead.next;
    }
}
