// class Solution {
//     public String triangleType(int[] nums) {
//         if (nums[0] == nums[1] && nums[0] == nums[2]) {
//             return "equilateral";
//         } else if (nums[0] == nums[1] && nums[0] != nums[2] || nums[0] == nums[2] && nums[0] != nums[1]
//                 || nums[2] == nums[1] && nums[0] != nums[2]) {
//             return "isosceles";
//         } else if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
//             return "scalene";
//         } else {
//             return "none";
//         }
//     }
// }


public class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0], b = nums[1], c = nums[2];

        if (a + b <= c) {
            return "none";
        }

        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
