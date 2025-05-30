// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,-1);
        list.add(1,-1);
        // int first =-1;
        // int last =-1;
        
        // for(int i=0; i< arr.length;i++){
        //     if(arr[i]==x){
        //         if(first==-1) first =i;
        //         else last =i;
        //     }
        // }
        int first = lower(arr,x);
        if(first == -1) return  list;
        
        int last = upper(arr,x);
        
        list.add(0,first);
        list.add(1,last);
        
        return list;
    }
    
    int lower(int[] arr, int x){
        int low=0;
        int high = arr.length-1;
        
        int first=-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]==x) {
                first = mid;
                high= mid-1;
            }
            
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }
    
    int upper(int[] arr, int x){
        int low=0;
        int high = arr.length-1;
        
        int last=-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]==x) {
                last = mid;
                low=mid+1;
            }
            
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }
}
