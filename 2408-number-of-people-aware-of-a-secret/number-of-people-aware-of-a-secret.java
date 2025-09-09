class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        
        long[] days = new long[n + 1];
        long total = 0;
        final int DIV = (int)1e9 + 7;

        days[1] = 1;
        
        for (int i = delay + 1; i <= n; ++i) {

            if (i - forget > 0)
                total = (total - days[i - forget] + DIV) % DIV;

            total = (total + days[i - delay]) % DIV;
            days[i] = total;
        }

        for (int i = n - delay + 1; i <= n; ++i) 
                total = (total + days[i]) % DIV;
    
        return (int)(total);
    }
}