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
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        
        ListNode tortis = head;
        ListNode hare = head.next;
        
        while (hare.next != null && hare.next.next != null) {
            
            if (tortis == hare) {
                return true;
            }
            
            tortis = tortis.next;
            hare = hare.next.next;
        }
        
        return false;
        
    }
}