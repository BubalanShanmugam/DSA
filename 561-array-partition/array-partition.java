class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max =0;
        for(int i=0;i<nums.length-1;i=i+2){
            max += nums[i];
        }
        return max;
    }
}