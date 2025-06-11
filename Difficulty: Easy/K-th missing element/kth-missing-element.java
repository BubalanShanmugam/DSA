// User function Template for Java

class Solution {

    int KthMissingElement(int arr[], int k) {
        // Complete the function
        // int low = 0;
        // int high = arr.length-1;
        
        // while(low<=high){
        //     int mid = (low+high)/2;
        //     int missing = arr[mid]-mid-1;
        //     if(missing<k){
        //         low=mid+1;
        //     }
        //     else{
        //         high=mid-1;
        //     }
        // }
        // return low+k;
        // // return high+k+1;
        
        int ans = -1;
        
        for(int i=1; i<arr.length; i++){
            int missing = arr[i] - arr[0] - i;
            if(missing >= k){
                ans = arr[i] - 1 - missing + k;
                break;
            }
        }
        
        return ans;
    }
}
