// User function Template for Java

class Solution {
    static int searchInsertK(int[] arr, int N, int target) {
        // code here
        // for(int i=0; i<nums.length ;i++){
        //     if(target == nums[i]) return i;
        //     else if(target > nums[i]) continue;
        //     else return i;
        // }
        // return nums.length;
        
        
        //optimal
        
        int low = 0;
        int high = N-1;
        int ans = N;
        
        while(low <= high){
            int mid = (low+high)/2;
            
            if(arr[mid]>=target) {
                ans = mid ;
                high = mid-1;
            }
            
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}