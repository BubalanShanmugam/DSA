// class Solution {
//     public int maxRemoval(int[] nums, int[][] queries) {
//         int qcount = queries.length;
        
//         for(int[] q : queries){
//             int one = q[0];
//             int two = q[1];
//             if(one ==0 && two ==0){
//                 continue;
//             }
//             int loopcount=0;
//             int i =0;
//             while(i< nums.length){
//                 if(i==one || i==two){
//                     nums[i]-=1;
//                     loopcount++;
//                 }
//                 if(loopcount==2) break;
//                 i++;
//             }
//             qcount--;
//             int count=0;
//             for (int num : nums) {
//                 if (num == 0) {
//                     count++;
//                 }
//             }   

//             if(count == nums.length){
//                 return qcount;
//             }
//             else if(qcount == 0){
//                 return -1;
//             }
//             else{
//                 continue;
//             }
//         }
//         return 1;
//     }
// }

class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        Arrays.sort(queries, (x, y) -> {
            return x[0] == y[0] ? x[1] - y[1] : x[0] - y[0];
        });
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((x, y) -> {
            return y[1] - x[1];
        });

        int arr[] = new int[nums.length + 2];
        int n = nums.length;
        int pos = 0;
        int anss = 0;
        for (int i = 0; i < n; i++) {
            while (pos < queries.length && queries[pos][0] <= i)
                pq.add(queries[pos++]);
            if (i > 0)
                arr[i] += arr[i - 1];
            nums[i] = nums[i] - arr[i];
            while (nums[i] > 0) {
                if (pq.isEmpty())
                    return -1;
                int t[] = pq.poll();
                if (t[1] >= i) {
                    arr[i + 1]++;
                    arr[t[1] + 1]--;
                    nums[i]--;
                } else
                    anss++;
            }
        }
        return anss + pq.size();
    }
}