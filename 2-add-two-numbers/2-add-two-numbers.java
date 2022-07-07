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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode sol = new ListNode(0);
        ListNode ans = sol;
        int remainder = 0;
        
        while (l1 != null && l2 != null) {
            
            int sum = l1.val + l2.val + remainder;
            remainder = 0;
            
            if (sum > 9) {
                remainder = 1;
            }
            sol.next = new ListNode(sum%10);
            sol = sol.next;
            
            l1=l1.next;
            l2=l2.next;
        }
        
        while (l1 != null) {
            int sum = l1.val + remainder;
            remainder = 0;
            
            if (sum > 9) {
                remainder = 1;
            }
            sol.next = new ListNode(sum%10);
            sol = sol.next;
            l1 = l1.next;
        }
        
        while (l2 != null) {
            int sum = l2.val + remainder;
            remainder = 0;
            
            if (sum > 9) {
                remainder = 1;
            }
            sol.next = new ListNode(sum%10);
            sol = sol.next;
            l2 = l2.next;
        }
        
        if (remainder != 0){
            sol.next = new ListNode(1);
        }
        
        return ans.next;
        
    }
}