/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        Node temp = head;
        int count =0;
        while(temp != null){
            count++;
            if(count == p+1) break;
            
            temp = temp.next;
        }

        Node node = new Node(x);
        if(temp.next == null) {
            temp.next = node;
            node.prev = temp;
            
            return head;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        node.prev = temp;

        return head;
    }
}