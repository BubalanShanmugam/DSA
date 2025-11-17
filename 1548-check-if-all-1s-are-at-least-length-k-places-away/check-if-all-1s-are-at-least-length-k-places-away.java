class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int index = -1;
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1) {
                index = i;
                break;
            }
        }

        for(int j=index+1;j<n;j++){
            if(nums[j]==1){
                if((j-index-1)>= k){
                    index = j;
                    continue;
                } 
               else return false; 
            }
            // if(nums[j]==0) count++;
            // else if(j!=0) {
            //     if(count>=k) {
            //         count =0;
            //         continue;
            //     }
            //     else return false;
            // }
        }
        return true;
    }
}