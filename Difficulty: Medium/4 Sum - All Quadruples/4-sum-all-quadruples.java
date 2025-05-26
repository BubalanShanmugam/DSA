// User function Template for Java

// arr[] : int input array of integers
// target : the quadruple sum required

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        // code here
        List<List<Integer>> mainlist = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int i =0; i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j =i+1; j<arr.length;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                
                int k = j+1;
                int l = arr.length-1;
                
                while(k<l){
                    long sum = arr[i]+arr[j]+arr[k]+arr[l];
                    
                    if(sum<target){
                        k++;
                    }
                    else if(sum > target){
                        l--;
                    }
                    else{
                        List<Integer> list = new ArrayList<>();
                        
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(arr[l]);
                        
                        mainlist.add(list);
                        
                        k++;
                        l--;
                        
                        while(k<l && arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1]) l--;
                    }
                }
            }
        }
        return mainlist;
    }
}