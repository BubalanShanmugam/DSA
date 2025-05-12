//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.gcd(a, b);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int gcd(int a, int b) {
        // code here
        // int gcd =0;
        // for(int i =1;i<= Math.min(a,b);i++){
        //     if((a%i ==0) && (b %i ==0)){
        //         gcd =i;
        //     }
        // }
        // return gcd;
        
        
        // int gcd =0;
        // for(int i = Math.min(a,b);i>=0;i--){
        //     if((a%i ==0) && (b %i ==0)){
        //         gcd =i;
        //         break;
        //     }
        // }
        // return gcd;
        
         while(b!=0)
       {
           int temp = b;
           b = a%b;
           a = temp;
       }
       return a;
    }
}
