class Solution {
    public void rotate(int[] nums, int k) {
        // // Copy the last k elements to the beginning
        // for (int i = 0; i < k; i++) {
        //     arr[i] = nums[n - k + i];
        // }

        // // Copy the first n-k elements after that
        // for (int i = k; i < n; i++) {
        //     arr[i] = nums[i - k];
        // }

        // // Copy back to original array
        // for (int i = 0; i < n; i++) {
        //     nums[i] = arr[i];
        // }

// ----------------------------------------------------------

        // int n = nums.length;
        // k = k % n;
        // int[] arr = new int[n];
        // int j =0;
        // for (int i = n - k; i < n ; i++) {
        //     arr[j] = nums[i];
        //     j++;
        // }

        // int l = 0;
        // for (int a = n-k-1; a >= 0; a--) {
        //     nums[n - 1 - l] = nums[a];
        //     l++;
        // }
       
       
        // int z=0;
        // for(int i =0; i<k;i++){
        //     nums[z] = arr[i];
        //     z++;
        // }

        // ------------------------------------------

            int n = nums.length;
            k = k % n;

            reverse(nums, 0, n-k-1);

            reverse(nums, n-k, n-1);

            reverse(nums, 0, n-1);

    } 

     static void reverse(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}