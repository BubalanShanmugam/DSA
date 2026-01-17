class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return func(nums, k)- func(nums, k-1);
    }

    public int func(int [] nums, int k ){
        if(k <0) return 0;
        int r=0,l=0,c=0,sum=0;  

        while(r<nums.length){
            sum += nums[r]%2;

            while(sum > k){
                sum -= nums[l]%2;
                l++;
            }

            c+= r-l+1;
            r++;
        }
        return c;
    }
}