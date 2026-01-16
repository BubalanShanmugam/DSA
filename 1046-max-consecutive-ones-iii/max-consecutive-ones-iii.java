class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0, l=0, r=0,len=0,z=0;

        while(r<nums.length){
            if(nums[r]==0) z++;

            if(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }

            if(z<=k){
                len = r-l+1;
                max = Math.max(max, len);
            }
            r++;
        }
        return max;
    }
}