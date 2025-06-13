
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int low = maxi(arr);
        int high = sum(arr); 
        
        if(arr.length < k) return -1;
        
        // for(int i = low ; i<= high;i++){
        //     int countstd = possible(arr,k,i);
        //     if(countstd==k) return i;
        // }
        // return -1;
        
        
        while(low<=high){
            int mid = (low+high)/2;
            int countsum = possible(arr,k, mid);
            if(countsum <=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public static int maxi(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max (max, i);
        }
        return max;
    }
    
    public static int sum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
    
    
    public static int possible(int[] arr, int k,int j){
        int std =1;
        int pages =0;
        
        for(int i =0; i< arr.length;i++){
            if(arr[i]+pages <=j){
                pages+=arr[i];
            }
            else{
                std=std+1;
                pages=arr[i];
            }
        }
        return std;
    }
    
}