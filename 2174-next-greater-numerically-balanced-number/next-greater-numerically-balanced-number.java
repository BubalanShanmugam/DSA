class Solution {
    public int nextBeautifulNumber(int n) {
        if(n > 666666) return 1224444;
        if(n==0) return 1;
        int m = n+1;
        while(n<666666){
            if(!Integer.toString(m).contains("0"))
            {
                if(isBalance(m)) return m;
            }
            m++;
        }
        return 1224444;
    }
    

    public boolean isBalance (int num){
        int[] in = new int[10];
        while(num > 0){
            int n = num % 10;
            in[n] = in[n] + 1;
            num = num / 10;
        }
        
        for(int i=1;i<10;i++){
            if(in[i] > 0 && in[i] != i ) return false;
        }
        return true;
    }
} 