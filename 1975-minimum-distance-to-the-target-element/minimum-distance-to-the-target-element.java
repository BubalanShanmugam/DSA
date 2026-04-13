class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int res = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i%nums.length] == target){
                res = Math.min(res,Math.abs(i-start));
            }
        }
        return res;
    }
}