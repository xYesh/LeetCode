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
    public ListNode removeElements(ListNode head, int val) {
        ListNode fake = new ListNode(-1);
        fake.next = head;
        ListNode prev = fake;
        
        while (head != null) {
            
            while (head != null && head.val == val) {
                prev.next = head.next;
                head = head.next;
            }
            
            
            if (head != null) {
                head = head.next;
                prev = prev.next;
            }
        }
        
        return fake.next;
        
        
    }
}