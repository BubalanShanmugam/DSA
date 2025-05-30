class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        ArrayList<Integer> list =new ArrayList<>();
        
        int first = lower(arr, target);
        int last = upper(arr, target);
        
        list.add(0,first);
        list.add(1, last);
        
        if(list.get(0)==-1) return 0;
        else return (list.get(1)-list.get(0))+1;
    }
    
    public int lower(int[] arr, int target){
        int low =0;
        int high = arr.length-1;
        int first =-1;
        
        while(low<=high){
        int mid = (low+high)/2;
        
        if(arr[mid]==target) {
            first = mid;
            high= mid-1;
        }
        else if(arr[mid]>target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return first;
    }
    
    
    public int upper(int[] arr, int target){
        int low =0;
        int high = arr.length-1;
        int last =-1;
        
        while(low<=high){
            
            int mid = (low+high)/2;
        
            if(arr[mid]==target) {
                last = mid;
                low  = mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }
}
