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

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>= r) return ;
        
        int mid = (l+r)/2;
        
        mergeSort(arr,l, mid);
        mergeSort(arr, mid+1, r);
        
        merge(arr, l, mid, r);
    }
    
    
    static void merge(int arr[], int low, int mid, int high){
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        int left =low;
        int r= mid+1;
        
        while(left <= mid && r<= high){
            if(arr[left] <= arr[r]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[r]);
                r++;
            }
        }
        
        while( left<=mid){
            temp.add(arr[left]);
            left++;
        }
        
        while(r<=high){
            temp.add(arr[r]);
            r++;
        }
        
        for(int i=low;i<=high;i++){
            arr[i]= temp.get(i-low);
        }
    }
}


// class Solution {

//     void mergeSort(int arr[], int l, int r) {
//         // code here
//         if(l>=r) return;
        
//         int mid=(l+r)/2;
//         mergeSort(arr, l, mid);
//         mergeSort(arr, mid+1, r);
//         merge(arr, l, mid, r);
//     }
    
//     void merge(int[] arr, int l, int mid, int r){
//         ArrayList<Integer> ans=new ArrayList<>();
//         int left=l, right=mid+1;
        
//         while(left<=mid && right<=r){
//             if(arr[left]<=arr[right]){
//                 ans.add(arr[left]);
//                 left++;
//             }else{
//                 ans.add(arr[right]);
//                 right++;
//             }
//         }
//             while(left<=mid){
//                 ans.add(arr[left]);
//                 left++;
//             }
//             while(right<=r){
//                 ans.add(arr[right]);
//                 right++;
//             }
        
        
//         for(int i=l; i<=r; i++){
//             arr[i]=ans.get(i-l);
//         }
//     }
// }