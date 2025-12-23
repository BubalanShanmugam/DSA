class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[1] - b[1]);
        int n = events.length;
        int[] prefix = new int[n];
        prefix[0] = events[0][2];
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i-1], events[i][2]);
        }
        
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int start = events[i][0];
            int value = events[i][2];
        
            int left = 0, right = i - 1;
            int j = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (events[mid][1] < start) {
                    j = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            if (j != -1) {
                maxSum = Math.max(maxSum, prefix[j] + value);
            } else {
                maxSum = Math.max(maxSum, value); // Single event case
            }
        }
        return maxSum;
    }
}