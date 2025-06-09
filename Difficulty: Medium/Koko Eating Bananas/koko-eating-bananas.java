class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low =0;
        int max =Integer.MIN_VALUE;
        int ans =0;
        
        
        for(int i : arr){
            max= Math.max(max, i);   
        }
        int high = max;
        
        while(low<=high){
            int mid = (low+high)/2;//low+(high-low)/2;
            int total=method(arr,mid);
            if(total <= k){
                ans = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    
    
    public static int method(int[] arr, int mid){
        int total =0;
        for(int i=0;i<arr.length;i++){
            total += Math.ceil((double)arr[i]/(double)mid);
        }
        return total;
    }
}
