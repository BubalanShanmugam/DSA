// class Solution {
//     public int minimumDistance(int[] nums) {
//         if(nums.length < 3) return -1;
//         int res = Integer.MAX_VALUE;
//         // HashMap<Integer, Integer> map = new HashMap<>();
//         int [][] arr = new int[nums.length+1][3];
//         for (int[] row : arr) {
//             Arrays.fill(row, -1);
//         }

//         for(int i =0;i<nums.length;i++){
//             // map.put(nums[i], map.getOrDefault(nums[i],0)+1);
//             int index = 2;
//             if(arr[nums[i]][0] == -1){
//                 index = 0;
//             }
//             else if(arr[nums[i]][1]==-1) index =1;
            
//             if(index ==2){
//                 arr[nums[i]][index]=Math.min(arr[nums[i]][index], i);
//             }
//             arr[nums[i]][index]=i;
            
//         }

//         for(int i =0;i<arr.length;i++){
//             if(arr[i][2]!=-1){
//                 res = Math.min(res, 2*(arr[i][2]-arr[i][0]));
//             }
//         }

//         return res;
//     }
// }


class Solution {

    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int ans = n + 1;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[i] != nums[j]) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (nums[j] == nums[k]) {
                        ans = Math.min(ans, k - i);
                        break;
                    }
                }
            }
        }

        return ans == n + 1 ? -1 : ans * 2;
    }
}