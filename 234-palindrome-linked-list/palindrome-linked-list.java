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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newNode = reverse(slow.next);
        ListNode second = newNode;
        ListNode first = head;
        while(second != null){
            if(first.val != second.val){
                reverse(newNode);
                return false;
            }
            first = first.next;
            second = second.next;
        }

        reverse(newNode);
        return true;
    }

    public static ListNode reverse(ListNode head){
        if(head.next == null || head == null) return head;

        ListNode newNode = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newNode;
    }
}