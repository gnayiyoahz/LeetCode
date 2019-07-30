/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
// Not a very time-efficient solution
// Use merge sort to ensure O(nlogn) running time

class Solution {
    public ListNode sortList(ListNode head) {
       
        if (head == null) {
            return null;
        }
        
        List<Integer> nums = new ArrayList<>();
        
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }

        // Collections interface built-in function
        Collections.sort(nums);

        ListNode myNode = new ListNode(0);
        ListNode n = myNode;
        for (int i = 0; i < nums.size()-1; i++) {
            n.val = nums.get(i); 
            n.next = new ListNode(0);
            n = n.next;
        }
        n.val = nums.get(nums.size()-1); 
        return myNode;
    }
}
