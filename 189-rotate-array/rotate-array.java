class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle if k > n

        int[] arr = new int[n];

        // Copy the last k elements to the beginning
        for (int i = 0; i < k; i++) {
            arr[i] = nums[n - k + i];
        }

        // Copy the first n-k elements after that
        for (int i = k; i < n; i++) {
            arr[i] = nums[i - k];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}
