class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int [] answer = new int[n-k+1];
        int max = 0;
        int val =0;
        int sum =0;
        TreeMap<Integer, Integer> map;

        for(int i=0; i<n-k+1; i++){
            sum =0;
            map = new TreeMap<>();
            for(int j=i; j<=i+k-1; j++){
                if(! map.isEmpty()){
                    map.put(nums[j], map.getOrDefault(nums[j], 0 )+1);
                }
                else{
                    map.put(nums[j], 1);
                }
            }

            for(int z=0;z<x;z++){
                for( int key : map.keySet()){
                    if(max <= map.get(key)){
                        max = map.get(key);
                        val = key;
                    }
                }
                sum += val * max;
                max =0;
                map.remove(val);
                answer[i]=sum;
            }            
        }
        return answer;
    }
}