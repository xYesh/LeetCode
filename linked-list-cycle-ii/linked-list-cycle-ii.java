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
    public ListNode detectCycle(ListNode head) {
        
        ListNode turtle = head;
        ListNode hare = head;
        
        while(hare!= null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
            
            if (turtle == hare) {
                break;
            }
        }
        
        if (hare == null || hare.next == null) {
            return null;
        }
        
        hare = head;
        
        while (turtle != hare) {
            hare = hare.next;
            turtle = turtle.next;
        }
        
        return hare;
                        
    }
}