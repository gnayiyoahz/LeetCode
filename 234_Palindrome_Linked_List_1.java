// i think this is pretty bad
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
        if (head == null || head.next == null){
            return true;
        }
        // at least 2
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null){
            arr.add(head.val);
            head = head.next;
        }
        return checkArr(arr);
            
    }
    public boolean checkArr(List arr) {
        if (arr.size() < 2) return true;
        if ((int)arr.get(0) != (int)arr.get(arr.size()-1)) {
            return false;
        }
        return checkArr(arr.subList(1,arr.size()-1));        
    }
}
