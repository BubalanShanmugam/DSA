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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp.next != null){
            ListNode t = temp.next;
            if(temp.val == t.val){
                while(t.next != null && t.next.val == temp.val){
                    t=t.next;
                }
                temp.next = t.next;
            }
            temp=t;
        }
        return head;
    }
}