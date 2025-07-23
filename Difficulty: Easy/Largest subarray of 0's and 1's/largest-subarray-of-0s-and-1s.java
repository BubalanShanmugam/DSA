class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        Map<Integer,Integer> hm=new HashMap<>();
        int max_len=0,sum=0;
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
              arr[i]=-1;
            sum+=arr[i];
            if(hm.containsKey(sum))
                max_len=Math.max(max_len,i-hm.get(sum));
            else
                hm.put(sum,i);
        }
        return max_len;
    }
}