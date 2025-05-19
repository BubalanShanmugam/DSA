//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.maxConsecutiveCount(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int maxConsecutiveCount(int[] arr) {
        // code here
        int count1 =0;
        int max1 =0;
        for(int i =0; i< arr.length;i++){
            if(arr[i]==1)
            {
                count1 ++;
                if(count1> max1){
                    max1 = count1;
            }
            }
            else{
                count1=0;
            }
        }
        
         int count0 =0;
        int max0 =0;
        for(int i =0; i< arr.length;i++){
            if(arr[i]==0)
            {
                count0 ++;
                if(count0> max0){
                    max0 = count0;
            }
            }
            else{
                count0=0;
            }
        }
        return Math.max(max1, max0);
    }
}
