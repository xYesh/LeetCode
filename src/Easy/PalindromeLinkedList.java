package Easy;

import util.ListNode;

public class PalindromeLinkedList {

    /**
     * Time complexity is o(n) as we iterate through the list only 1.5 times
     * space complexity is o(1) as this is an in place algorithm.
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode mid = getMedNode(head);
        ListNode revHalf = revF(mid.next);
        while (revHalf != null) {
            if (head.val != revHalf.val) {
                return false;
            }

            head = head.next;
            revHalf = revHalf.next;
        }
        return true;
    }

    private ListNode revF(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private ListNode getMedNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}
