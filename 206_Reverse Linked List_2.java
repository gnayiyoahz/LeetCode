/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 // iterative construction: somewhat simpler approach
 
class Solution {
    public ListNode reverseList(ListNode head) {
     
        ListNode temp = null;
        ListNode node = head;
        
        while(node != null) {
            ListNode copy = node.next;
            node.next = temp;
            temp = node;
            node = copy; 
        }
        return temp;
        
    }
}
