// class Solution {
//     public int findMaxLength(int[] nums) {
//         int one =0;
//         int zero=0;
//         int max =0;
//         int end =0;
//         int start=0;

//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                 if(nums[j]==0) one++;
//                 else zero++;
//                 if(one == zero && max < one+zero){
//                     max = one+zero;
//                     start=i;
//                     end = j;
//                 }
//             }   
//         }
//         return end-start+1;
//     }
// }







public class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}