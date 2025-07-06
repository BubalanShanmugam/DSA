/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        Node temp = head;
        int count =0;
        
        while(temp != null){
            count++;
            if(count==x) break;
            
            temp = temp.next;
        }
        
        Node prev = temp.prev;
        Node next = temp.next;
        
        if(prev == null){
            Node t = head;
            head = t.next;
            head.prev = null;
            t.next = null;
            
            return head;
        }
        if(next == null){
            prev.next = null;
            temp.prev = null;
            
            return head;
        }
        
        prev.next = next;
        next.prev = prev;
        
        return head;
        
    }
}