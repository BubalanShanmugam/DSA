//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to sort the array using bubble sort algorithm.
    // public static void bubbleSort(int arr[]) {
    //     // code here
    //     recursive(arr,0,arr.length-1);
    // }
    
    // static void recursive(int arr[], int n, int end){
    //     if(n == end) return;
        
    //     for(int start = 0 ; start <= end-1 ; start++){
    //     if(arr[start] > arr[start+1]){
    //         int temp =arr[start];
    //         arr[start] = arr[start+1];
    //         arr[start+1]=temp;
    //     }
    //     recursive(arr,n+1,end);
    // }
    // }
    
        public static void bubbleSort(int arr[]) {
        // code here
        recursive(arr,arr.length);
    }
  
    static void recursive(int arr[], int n){
        if(n == 1) return;
        
          boolean b = false; 
          
        for(int start = 0 ; start <= n-2 ; start++){
        if(arr[start] > arr[start + 1]){
            int temp =arr[start];
            arr[start] = arr[start+1];
            arr[start+1]=temp;
            b = true;
        }
        
    }
    if(!b) return;
        recursive(arr,n-1);
    }
}


//{ Driver Code Starts.

class Sorting {
    // method to print the Elements of the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            // calling bubbleSort() method
            new Solution().bubbleSort(arr);

            // calling printArray() method
            printArray(arr);

            t--;
        }
    }
}
// } Driver Code Ends