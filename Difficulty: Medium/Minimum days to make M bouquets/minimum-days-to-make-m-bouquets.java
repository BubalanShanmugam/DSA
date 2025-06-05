// User function Template for Java
class Solution {
    public static int minDaysBloom(int m, int k, int[] arr) {
        // code here
        
        int low = mini(arr);
        int high = maxi(arr);
        int ans =-1;
        while(low<=high){
            int mid = (low+high)/2;
            
            if(possible(arr, mid, m ,k)){
                ans =mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    
        static boolean possible(int[] arr, int mid, int m , int k){
            int count=0;
            int nofbloom =0;
            
            for(int i =0; i< arr.length;i++){
                if(arr[i]<=mid){
                    count++;
                }
                else{
                    nofbloom = nofbloom + (count/k);
                    count=0;
                }
            }
            nofbloom +=(count/k);
            
            if(nofbloom>=m) return true;
            else  return false;
        }
        
        static int mini(int [] arr){
            int mini = Integer.MAX_VALUE;
            for(int i: arr){
                mini = Math.min(mini, i);
            }
            return mini;
        }
        
        static int maxi(int [] arr){
           int maxi = Integer.MIN_VALUE;
            for(int i: arr){
                maxi = Math.max(maxi, i);
            }
            return maxi; 
        }
}