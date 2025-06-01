// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here 
        int low =0;
        int high = arr.size()-1;
        int ans = Integer.MAX_VALUE;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr.get(low)<= arr.get(high)){
                ans = Math.min(ans, arr.get(low));
                    return arr.indexOf(ans);
            }
            
            if(arr.get(low)<=arr.get(mid)){
                ans = Math.min(ans, arr.get(low));
                low=mid+1;
            }
            else{
                ans = Math.min(ans, arr.get(mid));
                high = mid-1;
            }
        }
        return arr.indexOf(ans);
    }
}