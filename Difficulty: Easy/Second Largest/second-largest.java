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
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // Arrays.sort(arr);
        // int largest = arr[arr.length-1];
        // int second = -1;
        // for(int i : arr){
        //     if( i> second && i < largest){
        //         second = i;
        //     }
        // }
        // return second;
        
        //------------------------------------------------
        
        // Arrays.sort(arr);
        // return ar[arr.length -2];
        
        
        //------------------------------------------------
        
        int largest = arr[0];
        int second = -1;
        for(int i: arr){
            if(i>largest){
                second = largest;
                largest = i;
            }
            else if(largest > i && second <i){
                second =i;
            }
        }
        return second;
    }
}