//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().insertionSort(arr);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            // System.out.println();

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Please change the array in-place
    // public void insertionSort(int arr[]) {
    //     // code here
    //     for(int i =1;i<= arr.length -1;i++){
            
    //         int j =i-1;
    //         while(j>=0 && arr[j]>arr[j+1]){
    //           int temp = arr[j];
    //             arr[j] = arr[j+1];
    //             arr[j+1]=temp;
    //             j--;
    //         }
    //     }
    // }
    
    public void insertionSort(int arr[]){
        insertion(arr,arr.length,0);
    }
    
    
    public void insertion(int arr[], int n, int i) {
        // code here
        if(i==n-1) return ;
            
            int j =i;
            while(j>=0 && arr[j]>arr[j+1]){
               int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
                j--;
            }
            insertion(arr, n, i+1);
        }
    
}