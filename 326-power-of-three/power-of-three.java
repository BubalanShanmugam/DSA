class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;

        while(n%3==0){
            n /= 3;
        }
        return n==1;

        // int pow =0;
        // int ans =0;
        // while(ans<n){
        //     ans = (int) Math.pow(3,pow);
        //     pow++;
        // }
        // return ans == n;


    
    }
}