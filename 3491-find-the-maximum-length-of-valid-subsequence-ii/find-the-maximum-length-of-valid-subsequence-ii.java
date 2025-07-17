// class Solution {
//     public int maximumLength(int[] nums, int k) {
//         int[] ans = new int[nums.length];
//         int count=2;

//         int difrem= (nums[0]+nums[1])%k;
//         ans[0]=nums[0];
//         ans[1]= nums[1];
//         int j=2;
//         for(int i=1;i<nums.length-1;i++){
//             if((nums[i]+nums[i+1])%k == difrem){
//                     ans[j++]= nums[i];
//                     count++;
//                     if(i+1==nums.length) {
//                         ans[j++]=nums[i+1];
//                         count++;
//                     }
//             }
//         }
//         return count;
//     }
// }




class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] ans = new int[k][k];

        int count=0;
        for(int n : nums){
            n %=k;
            for(int pre =0;pre<k;pre++){
                ans[pre][n] = ans[n][pre]+1;
                count=Math.max(count, ans[pre][n]);
            }
        }
        return count;
    }
}