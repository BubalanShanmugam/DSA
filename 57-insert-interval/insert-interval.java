// class Solution {
//     public int[][] insert(int[][] inter, int[] ni) {
//         int [][] res = new int[inter.length][2];
//         int j=0;
//         int i=0;
//         while(i<inter.length){
//             if(inter[i][1]>=ni[0]){
//                 res[j][0]=inter[i][0];
//                 i++;
//                 while(i<inter.length-1 && ni[1]>inter[i][0]){
//                     i++;
//                 }
//                 if(ni[1]<inter[i][0]) res[j][1]= ni[1];
//                 else {
//                     res[j][1]=Math.max(ni[1], inter[i][1]);
//                     i++;
//                 }
//                 j++;
//                 break;
//             }
//             else{
//                 res[j][0]=inter[i][0];
//                 res[j][1]=inter[i][1];
//                 i++;
//                 j++;
//             }
//         }
//         while(i<inter.length){
//             res[j][0]=inter[i][0];
//             res[j][1]=inter[i][1];
//             i++;
//             j++;
//         }
//         return Arrays.copyOfRange(res,0,j);
//     }
// }

class Solution {
    public int[][] insert(int[][] inter, int[] ni) {
        int [][] res = new int[inter.length+1][2];
        int j=0;
        int i=0;

        while(i<inter.length && inter[i][1]<ni[0]){
            res[j][0]=inter[i][0];
            res[j][1]=inter[i][1];
            i++;
            j++;
        }

        while(i<inter.length && inter[i][0] <= ni[1]){
            ni[0]=Math.min(ni[0],inter[i][0]);
            ni[1]=Math.max(ni[1],inter[i][1]);
            i++;
        }
        res[j][0]=ni[0];
        res[j][1]=ni[1];
        j++;
        
        while(i<inter.length){
            res[j][0]=inter[i][0];
            res[j][1]=inter[i][1];
            i++;
            j++;
        }
        return Arrays.copyOfRange(res,0,j);
    }
}