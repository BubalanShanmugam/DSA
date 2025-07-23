class Solution {
    public long coloredCells(int n) {
        // return (long) Math.pow(n,2)+n-1;



        // return 1+(long)n*(n-1)*2;



        long color =1;
        int ad=4;
        while(--n>0){
            color +=ad;
            ad+=4;
        }
        return color;
    }
}