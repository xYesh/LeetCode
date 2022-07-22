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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode start = head;
        ListNode revS = reverse(slow.next);
        // System.out.println(start.val + " " + revS.val);
                
        while (revS != null) {
            
            // System.out.println(start.val + " " + revS.val);
            if (start.val != revS.val) {
                return false;
            }
            
            start = start.next;
            revS = revS.next;
        }
        
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        
        ListNode prev = null;
        
        while(head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        
        return prev;
        
    }
}