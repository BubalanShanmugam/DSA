// class Solution {
//     public long maximumValueSum(int[] nums, int k, int[][] edges) {
//         int n = nums.length;
//         int a=0;
//         int b=0;
        
//         int max =0;
//         for(int i: nums){
//             max += i;
//         }
//         for(int []arr : edges){
//             a = arr[0];
//             b = arr[1];
//             int[] temp = Arrays.copyOf(nums, n);
//             temp[a] = nums[a] ^ k;
//             temp[b] = nums[b] ^ k;
//             int sum=0;
//             for(int i =0; i<temp.length; i++){
//                 sum += temp[i];
//             }
//             max = Math.max(sum, max);
//         }
//         return max;
//     }
// }


class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long totalSum = 0;
        int xorBenefitCount = 0;
        int minLoss = Integer.MAX_VALUE;

        for (int num : nums) {
            int xorValue = num ^ k;
            totalSum += Math.max(num, xorValue);

            if (xorValue > num) {
                xorBenefitCount++;
                minLoss = Math.min(minLoss, xorValue - num);
            } else {
                minLoss = Math.min(minLoss, num - xorValue);
            }
        }
        if (xorBenefitCount % 2 == 1) {
            totalSum -= minLoss;
        }

        return totalSum;
    }
}