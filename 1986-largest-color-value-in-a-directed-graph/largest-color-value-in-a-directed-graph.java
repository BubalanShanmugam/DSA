class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        List<Integer>[] graph = new ArrayList[n];
        int[] indegree = new int[n];
        int[][] count = new int[n][26]; // count[i][c]: max number of color c to node i

        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            indegree[edge[1]]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++)
            if (indegree[i] == 0) queue.offer(i);

        int processed = 0;
        int maxColor = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            processed++;
            int colorIndex = colors.charAt(node) - 'a';
            count[node][colorIndex]++;

            maxColor = Math.max(maxColor, count[node][colorIndex]);

            for (int neighbor : graph[node]) {
                for (int c = 0; c < 26; c++) {
                    count[neighbor][c] = Math.max(count[neighbor][c], count[node][c]);
                }
                if (--indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return processed == n ? maxColor : -1;
    }
}
