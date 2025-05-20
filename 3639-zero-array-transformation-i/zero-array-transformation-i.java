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
        int[] decrementOps = new int[n + 1];  // diff array

        // Instead of looping over every element in the query range,
        // we just mark the range in difference array
        for (int[] q : queries) {
            int start = q[0];
            int end = q[1];
            decrementOps[start]++;
            if (end + 1 < n) {
                decrementOps[end + 1]--;
            }
        }

        // Accumulate the difference array to get total decrement for each index
        int[] finalArray = Arrays.copyOf(nums, n);
        int applied = 0;
        for (int i = 0; i < n; i++) {
            applied += decrementOps[i];
            // Simulate your logic: only subtract from non-zero
            finalArray[i] = Math.max(finalArray[i] - applied, 0);
        }

        // Final check
        for (int num : finalArray) {
            if (num != 0) return false;
        }
        return true;
    }
}
