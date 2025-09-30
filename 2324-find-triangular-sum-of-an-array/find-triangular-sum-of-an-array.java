class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
        
        int[] newarr = new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            newarr[i]= (nums[i]+nums[i+1])%10;
        }

        return triangularSum(newarr);
    }
}