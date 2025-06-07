// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] res = new int[n];
        if(n==1) return res;
        int num1 = 0;
        int num2 = 1;
        res[0]= num1;
        res[1]= num2;
        for(int i =2; i<n;i++){
            int num3 = num1+num2;
            res[i]=num3;
            num1=num2;num2=num3;
        }
        return res;
    }
}