/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // iterative construction: straightforward version
 
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if (head == null || head.next == null) return head;
        
        ListNode dumHead = new ListNode(0);
        dumHead.next = new ListNode(head.val);
        
        while (head != null && head.next != null){
            ListNode temp = new ListNode(head.next.val);
            temp.next = dumHead.next;
            dumHead.next = temp;
            head = head.next;              
        }
        
        return dumHead.next;
    }
}
