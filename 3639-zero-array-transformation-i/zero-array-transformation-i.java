// class Solution {
//     public boolean isZeroArray(int[] nums, int[][] queries) {
//         int begining;
//         int end;
//         List<Integer> array = new ArrayList<>();
//         for(int[] i : queries){
//              begining = i[0];
//              end = i[1];

//              for(int j =begining; j<= end; j++) {
//                      array.add(nums[j]);
//              }
//              array = array.stream()
//                     .map(z -> z != 0 ? z - 1 : z)
//                     .collect(Collectors.toList());
//         }

//         return Collections.frequency(array, 0) == nums.length;
//     }
// }





// class Solution {
//     public boolean isZeroArray(int[] nums, int[][] queries) {
//         int[] copy = Arrays.copyOf(nums, nums.length); 

//         for (int[] q : queries) {
//             int start = q[0];
//             int end = q[1];

//             for (int i = start; i <= end; i++) {
//                 if (copy[i] != 0) {
//                     copy[i]--; 
//                 }
//             }
//         }
//         for (int num : copy) {if (num != 0) return false;}
//         return true;
//     }
// }







class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1]; // +1 to handle end+1

        // Apply range updates using difference array
        for (int[] q : queries) {
            int start = q[0];
            int end = q[1];
            diff[start]++;
            if (end + 1 < n) {
                diff[end + 1]--;
            }
        }

        // Calculate prefix sum to get final decrement count per index
        int[] decrements = new int[n];
        decrements[0] = diff[0];
        for (int i = 1; i < n; i++) {
            decrements[i] = decrements[i - 1] + diff[i];
        }

        // Check if each element can be reduced to 0
        for (int i = 0; i < n; i++) {
            if (nums[i] > decrements[i]) {
                return false;
            }
        }
        return true;
    }
}
