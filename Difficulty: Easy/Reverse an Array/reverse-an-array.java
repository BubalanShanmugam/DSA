//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

// class Solution {
    
//     static void myown(int[] arr,int i , int n) {
//         if(n/2 <=i) return;
        
//         arr[i]= arr[n-i-1];
//         myown(arr, i+1, n);
//     }
// }


class Solution {
    public void reverseArray(int[] arr) {
        myown(arr, 0, arr.length - 1);  // Call with 0 and last index
    }

    static void myown(int[] arr, int left, int right) {
        if (left >= right) return;  // Base case

        // Swap elements
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursive call
        myown(arr, left + 1, right - 1);
    }
}

