class Solution {
    public int countOdds(int low, int high) {
        // int count =0;
        // for(int i=low;i<=high;i++){
        //     if(i%2==1) count++;
        // }
        // return count;

        int n = high-low+1;
        if(n%2==0) return n/2;
        else{
            if(low%2==1 || high%2==1){
                return (n/2)+1;
            }
            else return n/2;
        } 
    } 
}