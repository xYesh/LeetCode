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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode curr = new ListNode(0);
        ListNode dummy = curr;
        
        while (list1 != null && list2 != null) {
            
            int val1 = list1.val;
            int val2 = list2.val;
            
            if (val1 < val2) {
                curr.next = new ListNode(val1);
                curr = curr.next;
                list1 = list1.next;
            } else {
                curr.next = new ListNode(val2);
                curr = curr.next;
                list2 = list2.next;
            }
        }
        
        if (list1 != null) {
            curr.next = list1;
        } else if (list2 != null) {
            curr.next = list2;
        }
        
        return dummy.next;
        
    }
}