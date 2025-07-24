/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node fast = head;
        Node slow = head;
        if(head.next ==null) return head.data;
        
        while( fast != null && fast.next !=null){
           slow = slow.next;
           fast = fast.next.next;
        }
        
        return slow.data;
    }
}