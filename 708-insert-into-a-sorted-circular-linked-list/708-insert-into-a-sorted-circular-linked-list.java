/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        
        if (head == null) {
            Node sol = new Node(insertVal);
            sol.next = sol;
            return sol;
        }
        
        Node fakeHead = new Node(-1);
        fakeHead.next = head;
        Node prev = head;
        head = head.next;
        while (true) {
            
            if (prev.val <= insertVal && head.val >= insertVal) {
                Node sol = new Node(insertVal);
                prev.next = sol;
                sol.next = head;
                break;
            }
            
            if (prev.val > head.val) {
                //if sol is smallest or largest in list.
                // System.out.println("here")
                if (insertVal >= prev.val || insertVal <= head.val ) {
                    Node sol = new Node(insertVal);
                    prev.next = sol;
                    sol.next = head;
                    break;
                }
            }
            
            if (prev == head || head == fakeHead.next) {
                prev.next = new Node(insertVal, head);
                break;
            }
                        
            prev = head;
            head = head.next;
            
        }        
        return fakeHead.next;
        
    }
}