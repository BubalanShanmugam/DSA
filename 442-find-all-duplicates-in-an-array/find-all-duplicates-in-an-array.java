class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.size()==0 && !map.containsKey(nums[i])){
        //         map.put(nums[i],0);
        //     }
        //     else{
        //         map.set(nums[i], map.get(nums[i])+1);
        //     }
        // }
        // for(int i: map.keySet()){
        //     if(map.get(i) <=1) map.remove(i);
        // }
        // return map.values().stream().collect(Collectors.toList());


        Arrays.sort(nums);

        for(int i=0;i< nums.length-1;i++){
            if(nums[i]==nums[i+1]) list.add(nums[i]);
        }
        return list;
    }
}