// User function Template for Java

class Solution {
    int median(int mat[][]) {
        // code here
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int m = mat[0].length;
        for(int i=0;i<mat.length;i++){
            low = Math.min(low,mat[i][0]);
            high = Math.max(high,mat[i][m-1]);
        }
        int req = (mat.length * m)/2;
        while(low<=high){
            int mid = (low+high)/2;
            
            int smallorequal = method(mat,mid);
            if(smallorequal > req) high=mid-1;
            else low=mid+1;
        }
        return low;
    }

    
    public static int method(int[][] mat, int mid){
        int count =0;
        for(int i=0;i<mat.length;i++){
            if(mat[i][0]>mid) continue;
                
            count += upperbound(mat[i], mid);
        }
        return count;
    }

    public static int upperbound (int[] arr, int m){
        int low =0;
        int high = arr.length-1;
        int ans=arr.length;
        while(low<=high) {
            int mid = (low+high)/2;
            
            if(arr[mid]<=m){
                low = mid +1;
            }
            else{
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}