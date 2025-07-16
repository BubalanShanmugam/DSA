// class Solution {
//     public int maximumLength(int[] nums) {
//         int[] ans = new int[nums.length];

//         int count=2;

//         int difrem= (nums[0]+nums[1])%2;
//         ans[0]=nums[0];
//         ans[1]= nums[1];
//         int j=2;
//         for(int i=1;i<nums.length-1;i++){
//             if((nums[i]+nums[i+1])%2 == difrem){
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
    public int maximumLength(int[] nums) {
        int even =0;
        int odd =0;
        for(int nu : nums){
            if(nu%2==0) even++;
            else odd++;
        }

        int evendp=0;
        int odddp=0;
        for(int num : nums){
            if(num%2==0) evendp = Math.max(evendp, odddp+1);
            else odddp = Math.max(odddp, evendp+1);
        }
        return Math.max(Math.max(even, odd), Math.max(evendp,odddp));
    }
}