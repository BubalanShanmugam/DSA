class Solution {
    public int maxSubArray(int[] nums) {
       int sum=0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length ; i++){
            //  n = nums[i];
            // for(int j=0 ; j<nums.length ; j++){
                 sum = sum + nums[i];
                //  if(nums.length == 1){
                //     sum = 1;
                //     break;
                //  }
                // if(n  > sum){
                //     sum = n;
                // }
                max = Math.max(sum,max);
                if(sum < 0) sum = 0;
            }
        return max;
    }
    }