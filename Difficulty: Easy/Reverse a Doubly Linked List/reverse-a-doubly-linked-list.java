/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // code here
    
        
        if(head.next == null || head == null ) return head;
        
        DLLNode last = null;
        DLLNode temp = head;
        
        while(temp != null){
            last = temp.prev;
            temp.prev=temp.next;
            temp.next=last;
            
            temp=temp.prev;
        }
        
        return last.prev;
    
    }
}