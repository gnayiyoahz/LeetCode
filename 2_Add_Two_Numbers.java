/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
// Not a concise format though

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result, n1 = l1, n2 = l2;
        int add1 = 0;
        
        while(n1 != null || n2 != null) {            
            if (n1 == null) {
                n1 = new ListNode(0);
            } else if (n2 == null) {
                n2 = new ListNode(0);
            }
            
            int sum = n1.val + n2.val + add1;
            add1 = sum/10;
            curr.val = sum%10;
            
            if (n1.next != null || n2.next != null) {
                curr.next = new ListNode(0);
                curr = curr.next;
            }
            n1 = n1.next;
            n2 = n2.next;
           
        }
        
        if (add1 == 1) {
            curr.next = new ListNode(1);
        }
        
        return result;
    }
}
