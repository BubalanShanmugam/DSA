class Solution {
    public int numSub(String s) {
        // int count =0;
        long res =0;
        // int n = s.length();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='1') count++;
        //     else count =0;

        //     res += count % 1000000007;
        // }

        int i =0;
        int len =0;
        while(i<s.length()){
            len =0;
            while(i< s.length() && s.charAt(i)=='1'){
                i++;
                len++;
            }
            i++;
            res += (long) len*(len+1)/2 % 1000000007;
        }
        return (int)res;
    }
}