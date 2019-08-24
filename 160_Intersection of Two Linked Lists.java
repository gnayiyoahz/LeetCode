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
        int i = 0, j = 0;
        ListNode a = headA, b = headB;
        
        while (headA != null) {
            i++;
            headA = headA.next;
        }
        while (headB != null) {
            j++;
            headB = headB.next;
        }
        
        if (i-j > 0) {
            for (int k = 0; k < i-j; k++) {
                a = a.next;
            }
        } else if (i-j < 0) {
            for (int k = 0; k < j-i; k++) {
                b = b.next;
            }
        } 
        
        while (a != null && b != null){
            if (a == b) return a;
            a = a.next;
            b = b.next;
        }
        
        return null;
        
    }
}
