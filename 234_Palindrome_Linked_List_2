/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode head2 = null;
        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                head = head.next;
                break;
            }
            fast = fast.next;

            ListNode next = head.next;
            head.next = head2;
            head2 = head;
            head = next;
        }

        while (head != null) {
            if (head.val != head2.val) {
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }

        return true;
    }
}
