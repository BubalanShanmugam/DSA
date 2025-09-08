class Solution {
    public int[] getNoZeroIntegers(int n) {
        // int [] res;

        for(int i=1;i<n;i++){
            int a = i;
            int b = n-i;
            
            String s = String.valueOf(a);
            String t = String.valueOf(b);
            if( (a+b) == n && !(s.contains("0")) && !(t.contains("0"))) return new int[]{a,b};
            
        }
        return new int[2];
    }
}