/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node fakeHead = new Node(-1);
        
        fakeHead.next = head;
        
        while (head != null) {
            
            if (head.child == null) {
                head = head.next;
                continue;
            }
            
            Node hnext = head.next; 
            
            Node temp = head.child;
            head.next = temp;
            temp.prev = head;
            
            while (temp.next != null) {
                temp = temp.next;
            }
            
            temp.next = hnext;
            
            if (hnext != null) {
                hnext.prev = temp;
            }
            
            head.child = null;
            
        }
        
        return fakeHead.next;
        
    }
}