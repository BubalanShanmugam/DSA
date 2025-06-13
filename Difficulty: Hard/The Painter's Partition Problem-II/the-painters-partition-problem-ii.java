// User function Template for Java

class Solution {
    public int minTime(int[] a, int k) {
        // code here
        int low =maxi(a);
        int high = sum(a);
        
        // if(a.length<k) return -1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            int count = possible(a,k,mid);
            if(count<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return low;
    }
    
    public static int maxi(int[] arr){
        int max =Integer.MIN_VALUE;
        for(int i:arr){
            max = Math.max(max,i);
        }
        return max;
    }

    public static int sum(int[] arr){
        int sum =0;
        for(int i:arr){
            sum +=i;
        }
        return sum;
    }
    
    public static int possible(int[]arr, int k, int mid){
        int count =1;
        int sum =0;
        
        for(int i =0; i< arr.length;i++){
            if(sum + arr[i] <= mid){
                sum +=arr[i];
            }
            else{
                sum = arr[i];
                count++;
            }
        }
        return count;
    }
}
