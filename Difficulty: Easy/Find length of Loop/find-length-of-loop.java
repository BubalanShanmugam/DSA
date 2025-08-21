/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here.
        Node s = head;
        Node f = head;
        
        while(f!=null && f.next !=null){
            s=s.next;
            f=f.next.next;
            if(s==f) return findlength(s,f);
        }
        return 0;
    }
    
    public static int findlength(Node s, Node f){
        int count =1;
        f=f.next;
        while(f!=s){
            count++;
            f=f.next;
        }
        return count;
    }
}