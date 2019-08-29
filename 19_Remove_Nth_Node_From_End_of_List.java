/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        if (count == n) return node.next;
        
        head = node;
        for (int i = 0; i < count-n-1; i++) {
            head = head.next;
        }
        if (head.next != null){
            head.next = head.next.next;
        } else {
            return null;
        }
        return node;
    }
}
