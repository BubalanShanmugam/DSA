class Solution {
    public int singleNumber(int[] nums) {
//         int [] arr = Arrays.stream(nums).distinct().toArray();
//         int freq = -1;
//         List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
//         for(int i : arr){
//              freq = Collections.frequency(list, i);
//             if(freq==1){
//                 return i;
//             }
//         }
//         return freq;



        int o =0;
        for(int i : nums){
            o = o^i;
        }
        return o;
    }
}