// class Solution {
//     public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
//         List<Integer> list = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             for(int j =0; j< nums.length;j++){
//                 if(nums[j]==key && Math.abs(i-j)<=k){
//                     list.add(i);
//                     break;
//                 }
//             }
//         }
//         return list;
//     }
// }

class Solution {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length, left = 0, right = 0;

        while (left < len && right < len) {
            if (nums[right] != key)
                right++;
            else if (left < right - k)
                left++;
            else if (left <= right + k)
                list.add(left++);
            else
                right++;
        }

        return list;
    }

}
