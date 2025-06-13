// class Solution {
//     public boolean canJump(int[] nums) {
//         int i=0;
//         int n = nums.length;

//         while(i<=n-1){
//             if(i==n-1) return true;
//             i = (i+nums[i]);
//         }
//         return false;
//     }
// }

class Solution {
    public boolean canJump(int[] nums) {
       int reachable = 0;
       for(int i = 0; i < nums.length; i ++) {
           if(i > reachable) return false;
           reachable = Math.max(reachable, i + nums[i]);
       } 
       return true;
    }
}