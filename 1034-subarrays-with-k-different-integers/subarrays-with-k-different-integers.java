class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums, k)-func(nums, k-1);
    }

    public int func(int[] nums, int k ){
        if(k<0) return 0;
        int r=0, l=0, c=0;
        Map<Integer, Integer> map = new HashMap<>();

        while ( r< nums.length){
            map.put(nums[r], map.getOrDefault(nums[r],0)+1);

            while(map.size() > k){
                map.put(nums[l], map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            c= c + r - l + 1;
            r++;
        }
        return c;
    }
}