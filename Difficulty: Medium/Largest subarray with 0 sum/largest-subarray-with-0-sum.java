class Solution 
{
    int maxLen(int arr[]) 
    {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int maxindex = 0;
        int sum =0;
        
        for(int i =0 ; i< arr.length;i++){
            sum+= arr[i];
            
            if(sum ==0){
                maxindex = i+1;
            }
            else{
                if(map.get(sum)!=null){
                    maxindex = Math.max(maxindex, i-map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return maxindex;
    }
}