class Solution {
    public int smallestNumber(int n) {
        // for(int i=1;i<=n;i++){
        //     if(Math.pow(2,i)>=n) break;
        // }
        // if(n==1) return 1;
        int i=1;
        while(Math.pow(2,i)<= n){
            i++;
        }
        return (int) Math.pow(2,i)-1;
    }
}