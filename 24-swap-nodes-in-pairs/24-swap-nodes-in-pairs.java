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
    public ListNode swapPairs(ListNode head) {
        
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode prev = fake;
        
        while (head != null && head.next != null) {
            
            ListNode f = head;
            ListNode s = head.next;
            
            prev.next = s;
            f.next = s.next;
            s.next = f;
            
            head = f.next;
            prev = f;
            
            
        }
        
        return fake.next;
        
    }
}
