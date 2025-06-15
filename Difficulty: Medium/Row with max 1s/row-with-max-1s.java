// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int row =-1;
        int max =-1;
        int count =0;
        // O(n)
        for(int i=0; i<arr.length;i++){
            
            // O(m)
            
            // for(int j=0;j<arr[i].length;j++){
            //     if(arr[i][j]==1){
            //         count ++;
            //     }
            // }
            
            // Therefore te optimation will be using BS [O(log m)]
            count = arr[i].length - countfunc(arr[i]);
            
            if(count>max){
                max = count;
                row =i;
            }
        }
        return row;
    }
    
    public static int countfunc(int[] arr){
        int low =0;
        int high = arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]==1){
                ans = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}