class Solution {
    public boolean hasAlternatingBits(int n) {
        // int m = n>>1;
        // int x = m^n;
        int x = n ^ (n>>1);
        return (x & (x+1))==0;
    }
}