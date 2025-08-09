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
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode next = null;
//         ListNode prev = null;
//         ListNode curr = head;

//         while(curr != null){
//             next = curr.next;
//             curr.next= prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
// }





class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }


    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;


        ListNode newnode = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newnode;
        

    }
}