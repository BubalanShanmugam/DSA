class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        
        if(arr.length > k) return -1;
        int low = 1;
        int max = Integer.MIN_VALUE;
        
        for(int i : arr){
            max = Math.max(max, i);
        }
        int high =max;
        
        while(low<=high){
            int mid = (low+high )/2;
                int total =0;
                for(int i=0;i<arr.length;i++){
                    total += (arr[i]+mid-1)/mid;
                    if(total>k){
                        break;
                    }
                }
            if(total <= k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}