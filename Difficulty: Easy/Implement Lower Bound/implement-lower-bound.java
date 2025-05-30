class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int low =0;
        int high = arr.length-1;
        
        int answer =arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]>=target){
                answer = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return answer;
    }
}
