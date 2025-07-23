class Solution {
    public long coloredCells(int n) {
        // return (long) Math.pow(n,2)+n-1;
        return 1+(long)n*(n-1)*2;
    }
}