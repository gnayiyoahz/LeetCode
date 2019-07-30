/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
 // simplistic approach
 // poor runtime performance, great memory usage
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        Set<ListNode> nodes = new HashSet<ListNode>();
        
        while (head != null) {
            if (nodes.contains(head)) {
                return true
            } else {
                nodes.add(head);
            }
            head = head.next;
        }      
        return false;
    }
    
}
