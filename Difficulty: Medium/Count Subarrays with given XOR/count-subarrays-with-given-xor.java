class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int xr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        map.put(xr, 1);
        
        for(int i =0; i< arr.length;i++){
            xr = xr ^ arr[i];
            int x = xr^k;
            if(map.containsKey(x)){
            count = count + map.get(x);
            }
            if(map.containsKey(xr)){
                map.put(xr, map.get(xr)+1);
            }
            else{
                map.put(xr,1);
            }
        }
        return count;
    }
}