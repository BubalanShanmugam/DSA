//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

// User function Template for Java

public static boolean prime(int n) {

    // Write your code here
    // String s = String.valueOf(n);
    // BigInteger b = new BigInteger(s);
    
    //     if(b.isProbalablePrime(5)){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // returns a boolean value
    int count =0;
    
    if(n==1){
        return false;
    }
    for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                // System.out.print(i+" ");
                count++;
                if((n/i) != i ){
                    // System.out.print(n/i+" ");
                    count++;
                }
            }
            
            if(count >2){
                return false;
            }
        }
        return true;
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            boolean ans = prime(n);
            if(ans)
            System.out.println("True");
            else
            System.out.println("False");
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends