class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res =0;
        for(int i=left ; i<= right; i++){
            res += countprime(countsetbit(i));
        }
        return res;
    }

     public static int countsetbit(int n ){
        int c =0;

        while(n>1){
            c += n&1;
            n= n>>1;
        }
        if(n==1) c++;
        return c;
    }


    public static int countprime(int n ){
        if(n==2 || n==3 || n==5 || n==7|| n== 11|| n== 13|| n==17|| n==19) return 1;
        return 0;
        // for(int i=2;i<n;i++){
        //     if(n%i==0) return 0;
        // }
        // return 1;
    }
}
