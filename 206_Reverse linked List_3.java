/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 
 // recursive construction

class Solution {
    public ListNode reverseList(ListNode head) {
        
        if (head == null || head.next == null) return head;
        
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        
        return node;
        
    }
}
