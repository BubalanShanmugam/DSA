// class Solution {
//     public int[] processQueries(int c, int[][] connections, int[][] queries) {
//         int [] arr = new int[c];
//         TreeMap<Integer, List<Integer>> map = new TreeMap<>();

//         int count=0;

//         for(int[] q : queries){
//             if(q[0]==1) count++;
//         }

//         int [] res = new int[count];

//         for(int[] con : connections){
//             if(map.containsKey(con[0])){
//                 map.get(con[0]).add(con[1]);
//             }
//             else{
//                 map.put( con[0], new ArrayList<>(con[1]));
//             }
//         } 

//         int index =0;
//         for(int [] q : queries){
//             if(q[0]==1){
//                 if(arr[q[1]-1]==0) {
//                     // arr[q[1]-1]==1;
//                     res[index++] = q[1];
//                 } 
//                 else{
//                     if(connections.length == 0 ){
//                         res[index++]=-1;
//                     }else if (map.get(q[0]) == null || map.get(q[0]).isEmpty()) {
//     res[index++] = -1;
// } else {
//     res[index++] = Collections.min(map.get(q[0]));
// }
//                 }
//             }
//             else{
//                 arr[q[1]-1] = 1 ;
//             }
//         }
//         return res;
//     }
// }

class DSU {

    private int[] parent;

    public DSU(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        return parent[x] == x ? x : (parent[x] = find(parent[x]));
    }

    public void join(int u, int v) {
        parent[find(v)] = find(u);
    }
}

class Solution {

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        DSU dsu = new DSU(c + 1);

        for (int[] p : connections) {
            dsu.join(p[0], p[1]);
        }

        boolean[] online = new boolean[c + 1];
        int[] offlineCounts = new int[c + 1];
        Arrays.fill(online, true);
        Map<Integer, Integer> minimumOnlineStations = new HashMap<>();
        for (int[] q : queries) {
            int op = q[0];
            int x = q[1];
            if (op == 2) {
                online[x] = false;
                offlineCounts[x]++;
            }
        }

        for (int i = 1; i <= c; i++) {
            int root = dsu.find(i);
            if (!minimumOnlineStations.containsKey(root)) {
                minimumOnlineStations.put(root, -1);
            }

            int station = minimumOnlineStations.get(root);
            if (online[i]) {
                if (station == -1 || station > i) {
                    minimumOnlineStations.put(root, i);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = queries.length - 1; i >= 0; i--) {
            int op = queries[i][0];
            int x = queries[i][1];
            int root = dsu.find(x);
            int station = minimumOnlineStations.get(root);

            if (op == 1) {
                if (online[x]) {
                    ans.add(x);
                } else {
                    ans.add(station);
                }
            }

            if (op == 2) {
                if (offlineCounts[x] > 1) {
                    offlineCounts[x]--;
                } else {
                    online[x] = true;
                    if (station == -1 || station > x) {
                        minimumOnlineStations.put(root, x);
                    }
                }
            }
        }

        Collections.reverse(ans);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}