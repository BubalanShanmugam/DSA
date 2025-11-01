// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode modifiedList(int[] nums, ListNode head) {
//         ListNode temp=head;
//         for(int i=0;i< nums.length;i++){
//             temp = head;
//             while(temp != null && temp.next != null){
//                 if(temp.val == nums[i]){
//                     head = head.next;
//                     temp.next = null;
//                     temp = head;
//                 }
//                 else if(nums[i] == temp.next.val){
//                     ListNode temp2 = temp.next;
//                     temp=temp2.next;
//                     temp2.next=null;
//                 }
//                 else{
//                     temp = temp.next;
//                 }
//             }
//         }
//         return temp;
//     }
// }



class Solution {

    public ListNode modifiedList(int[] nums, ListNode head) {
        // Create a HashSet for efficient lookup of values in nums
        Set<Integer> valuesToRemove = new HashSet<>();
        for (int num : nums) {
            valuesToRemove.add(num);
        }

        // Handle the case where the head node needs to be removed
        while (head != null && valuesToRemove.contains(head.val)) {
            head = head.next;
        }

        // If the list is empty after removing head nodes, return null
        if (head == null) {
            return null;
        }

        // Iterate through the list, removing nodes with values in the set
        ListNode current = head;
        while (current.next != null) {
            if (valuesToRemove.contains(current.next.val)) {
                // Skip the next node by updating the pointer
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head;
    }
}