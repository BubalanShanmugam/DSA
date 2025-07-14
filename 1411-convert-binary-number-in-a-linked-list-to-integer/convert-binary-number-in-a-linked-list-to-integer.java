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
    public int getDecimalValue(ListNode head) {
        // StringBuilder sb = new StringBuilder();
        // ListNode temp = head;
        // while(temp !=null){
        //     sb.append(temp.val);
        //     temp=temp.next;
        // }

        // int power =0;
        // int res =0;

        // String s = sb.toString();
        // for(int i=s.length()-1;i>=0 ;i--){
        //         int bit = s.charAt(i) -'0';
        //          res += (bit * Math.pow(2,power));
        //         power++;
        // }

        // return res;





    //     int power =0;
    //     int res =0;
    //     ListNode temp = head;
    //     while(temp !=null){
    //         int bit = temp.val;
    //         res += (bit * Math.pow(2,power));
    //         power++;
    //         temp=temp.next;
    //     }
    //     return res;
    // }



        int res =0;
        ListNode temp = head;
        while(temp !=null){
            res = (res << 1) | temp.val;
            temp=temp.next;
        }
        return res;

        
        // StringBuilder sb = new StringBuilder();
        // ListNode temp = head;
        // while(temp !=null){
        //     sb.append(temp.val);
        //     temp=temp.next;
        // }
        // String s = sb.toString();

        // int res = Integer.parseInt(s,2);
        // return res;
    }







}