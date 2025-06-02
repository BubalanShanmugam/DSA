// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low = 1;
        int high = m;
        
        while(low<=high){
            int mid = (low+high)/2;
            int p = power(mid,n,m);
            if(p==1) return mid;
            
            else if(p == 0) low = mid+1;
            
            else high = mid-1;
        }
        return -1;
    }
    
    int power(int mid, int n , int m){
        long ans=1l;
        
        for(int i =1; i<=n;i++){
            ans = ans*mid;
            
            if(ans > m) return 2;
        }
        if(ans == m) return 1;
        else return 0;
    }
}