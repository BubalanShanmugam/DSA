// class Solution {
//     public int maxFrequency(int[] nums, int k) {
//         // List<Integer> list = new ArrayList<>();
//         // for(int a:nums){
//         //     list.add(a);
//         // }

//         Arrays.sort(nums);

//         // Collections.sort(list);

//             for(int i =nums.length-1;i>0;i--){
//                 int diff = nums[i]- nums[i-1];
//                 if(diff !=0 && k>0){
//                     k= k-diff;
//                     // list.set((i-1) , list.get(i-1) +diff);
//                     nums[i-1]=nums[i-1]+diff;
//                 }
//             }
    
// List<Integer> list = new ArrayList<>();
//         for(int a:nums){
//             list.add(a);
//         }

//         int max =0;
//         for(int i : list){
//             int maxmax =Collections.frequency(list, i);
//             if(maxmax > max){
//                 max = maxmax;
//             }
//         }
//         return max;
//     }
// }

import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long total = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];
            
            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
