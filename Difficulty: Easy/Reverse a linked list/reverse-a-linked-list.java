// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

public class Solution{
    public  Node reverseList(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr != null){
           
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr= next;
        }
        return prev;
    }
    
}