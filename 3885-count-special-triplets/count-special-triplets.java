// class Solution {
//     public int specialTriplets(int[] nums) {
//         int c =0;
//         int n = nums.length;

//         for(int i =0; i<n-2;i++){
//             for(int j=i+1; j<n-1;j++){
//                 for (int k =j+1; k<n;k++){
//                     if(nums[i] == nums[j]*2 && nums[k] == nums[j]*2) c++;
//                 }
//             }
//         }
//         return c % 1000000007;
//     }
// }







class Solution {
    public int specialTriplets(int[] nums) {
        int n = 100001, mod = 1000000007;
        long ans = 0;
        int[] hash = new int[n], prev = new int[n];
        for(int i = 0; i < nums.length; i++) hash[nums[i]]++;
        for(int i = 1; i < nums.length - 1; i++) {
            prev[nums[i - 1]]++;
            int j = nums[i], k = 2*j;
            if(k < n) {
                ans += (long)prev[k] * (hash[k] - prev[k] - (j == 0 ? 1 : 0));
            }
        }
        return (int)(ans % mod);
    }
}