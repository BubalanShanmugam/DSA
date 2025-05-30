class Solution {
    public int[] searchRange(int[] nums, int x) {
        // int first=-1;
        // int last = -1;
        int [] result = {-1, -1};
        // for(int i=0; i< nums.length;i++){
        //     if(nums[i] == target){
        //         if(first == -1) first =i;
        //         last = i;
        //     }
        // }
        // result[0]=first;
        // result[1]=last;
        // return result;


        int lb = lower(nums, x);
        if(lb == nums.length || nums[lb] != x) return result;
        int up = upper(nums,x);
        result[0]=lb;
        result[1]=up-1;
        return result;
    }

    public int lower(int[] arr, int target){
        int low =0;
        int high = arr.length-1;

        int ans =arr.length;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]>= target){
                ans = mid;
                high = mid-1;
            }
            else{
               low=mid+1;
            }
        }
        return ans;
    }

    public int upper (int[] arr, int target){
        int low =0;
        int high= arr.length-1;
        int last =arr.length;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] > target){
                last = mid;
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return last;
    }
}