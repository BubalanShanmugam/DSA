class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int max = 0;
        int res =0;
        for(int[] dimen : d){
            int n = (dimen[0]*dimen[0])+(dimen[1]*dimen[1]);
            // res = dimen[0]*dimen[1];
            if(max < n){
            // max = Math.max(Math.sqrt((dimen[0]*dimen[0])+(diimen[1]*dimen[1])));
                max = n;
                res = dimen[0]*dimen[1];
            }
            else if(max == n){
                res = Math.max(res, dimen[0]*dimen[1]);
            }
        }
        return res;
    }
}