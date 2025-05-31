class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]==target) return true;

            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low = low+1;
                high = high-1;
                continue;
            }

            if(nums[mid]<=nums[high]){
                if(target<=nums[high] && nums[mid]<=target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(target<=nums[mid] && nums[low]<=target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return false;
    }
}