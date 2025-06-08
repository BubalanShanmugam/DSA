class Solution {
    public int countPairs(int[] deliciousness) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int modulo = 1000000007;
        for(int i : deliciousness){
            int sum = 1;
            for(int j = 0; j<22; j++){
                sum = 1<<j;
                if(i<=sum && map.containsKey(sum-i)){
                    count+=map.get(sum-i);
                    count%=modulo;
                }
            }
            map.put(i, (map.containsKey(i) ? map.get(i)+1: 1));

        }
        return count;
    }
}