class Solution {
    public int binarysearch(int[] arr, int target) {
        // Code Here
        int low =0;
        int high =arr.length-1;
        
        while(low<= high){
            
            int mid = (low+high)/2;
            
            if(arr[mid]==target) {
                while(mid-1>-1 && arr[mid-1]==target){
                    mid=mid-1;
                }
                return mid;
            }
            
            else if(arr[mid]< target) low= mid+1;
            
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}