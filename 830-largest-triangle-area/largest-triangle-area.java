// class Solution {
//     public double largestTriangleArea(int[][] points) {
//         // int len = 0;
//         // int bre =0;

//         // for(int[] i: points){
//         //     len = Math.max(i[0], len);
//         //     bre = Math.max(i[1], bre);
//         // }

//         // return (double) (len * bre)/2;      
//     }
// }


class Solution {
    public double largestTriangleArea(int[][] points) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < points.length - 2; i++) {
            int j = i + 1, k = points.length - 1;
            while (j<points.length-1) {
                // int x1 = points[i][0], x2 = points[j][0],x3 = points[k][0];
                // int y1 = points[i][1], y2 = points[j][1],y3 = points[k][1];
                double area = 0.5 * Math.abs((points[i][0] * (points[j][1] - points[k][1]) + points[j][0] * (points[k][1] - points[i][1]) + points[k][0] * (points[i][1] - points[j][1])));
                max = Math.max(area, max);
                k--;
                if(k == j){
                    k = points.length-1;
                    j+=1;
                }
            }

        }
        return max;
    }
}