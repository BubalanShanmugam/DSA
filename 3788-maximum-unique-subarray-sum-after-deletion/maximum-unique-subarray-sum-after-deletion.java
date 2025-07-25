class Solution {
    public int maxSum(int[] nums) {
        // Arrays.sort(nums);
        int sum =0;
        int max = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1] || nums[i]<=0){
        //         continue;
        //     }
        //     else{
        //         sum+=nums[i-1];
        //     }
        // }
        // return sum;
        Set<Integer> set = Arrays.stream(nums)
                                .boxed()
                                .filter(num -> num>0)
                                .collect(Collectors.toSet());
        if(set.isEmpty()) return Arrays.stream(nums).max().getAsInt();
        for(int i: set){
            sum+=i;
            // max = Math.max(sum, max);
        }
        return sum;
    }
}