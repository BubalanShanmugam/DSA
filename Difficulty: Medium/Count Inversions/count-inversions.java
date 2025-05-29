// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergesort(arr, 0, arr.length-1);
        // int count=0;
        // for(int i =0; i<arr.length-1;i++){
        //     for(int j =i+1; j< arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
    
    public static int mergesort(int [] arr, int low, int high){
        int count=0;
        if(low>=high) return count;
        else{
            int mid = (low+high)/2;
            count+=mergesort(arr, low, mid);
            count+=mergesort(arr, mid+1, high);
            count+=merge(arr, low, mid, high);
            return count;
        }
    }
    
    public static int merge(int []arr, int low, int mid, int high){
        List<Integer> list = new ArrayList<>();
        
        int left = low;
        int right = mid+1;
        int count = 0;
        
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                count+=(mid-left+1);
                right++;
            }
        }
        
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
        
        return count;
    }
}