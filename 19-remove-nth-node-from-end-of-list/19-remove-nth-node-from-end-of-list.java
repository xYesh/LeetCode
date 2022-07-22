/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode ptr = dummy;
        ListNode sol = dummy;
        
        for (int i=0;i<=n && ptr != null;i++) {
            ptr = ptr.next;
        }
        
        while (ptr != null) {
            ptr = ptr.next;
            sol = sol.next;
        }
        
        sol.next = sol.next.next;
        
        return dummy.next;
        
    }
}