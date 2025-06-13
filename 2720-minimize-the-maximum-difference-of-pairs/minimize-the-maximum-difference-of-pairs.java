class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int ans = 0;
        int low =0;
        int high = nums[nums.length-1]-nums[0];

        while(low<=high){
            int mid = (low+high)/2;

            if(possible (nums, p, mid)){
                
                ans = mid;
                high = mid-1;
            }
            else{
                    low=mid+1;
            }
        }
        return ans;
    }

    public static boolean possible(int[] nums, int p , int mid){
        int count =0;
        int i =0;
        while(i< nums.length-1){
            if(nums[i+1]-nums[i] <= mid){
                count++;
                i=i+2;
            }
            else{
                i=i+1;
            }
        }

        if(count >= p) return true;
        else return false;
    }
}