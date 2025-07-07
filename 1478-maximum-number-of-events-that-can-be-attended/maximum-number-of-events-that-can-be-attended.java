// class Solution {
//     public int maxEvents(int[][] events) {
//         int count =0;
//         Arrays.sort(events, (a,b) ->{
//             if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
//             else return Integer.compare(a[1],b[1]);
//         });
//         int d=1;
//         for(int i=0;i<events.length;i++){
//             if(events[i][0]<=d && d<=events[i][1]){
//                 count++;
//                 d++;
//             }
//         }
//         return count;
//     }
// }


class Solution {

    public int maxEvents(int[][] events) {
        int n = events.length;
        int maxDay = 0;
        for (int[] event : events) {
            maxDay = Math.max(maxDay, event[1]);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int ans = 0;
        for (int i = 1, j = 0; i <= maxDay; i++) {
            while (j < n && events[j][0] <= i) {
                pq.offer(events[j][1]);
                j++;
            }
            while (!pq.isEmpty() && pq.peek() < i) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                pq.poll();
                ans++;
            }
        }

        return ans;
    }
}