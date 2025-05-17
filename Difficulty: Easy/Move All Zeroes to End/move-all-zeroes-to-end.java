//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr);
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        // int [] array = new int[arr.length];
        // int j =0;
        // for(int i =0;i< arr.length;i++){
        //     if(arr[i]!=0){
        //         array[j]= arr[i];
        //         j++;
        //     }
        // }
        
        // for(int k=0;k<arr.length;j++){
        //     arr[k]=array[k];
        // }
        
        
        
        
        
        
        // int [] array = new int[arr.length];
        // int j =0;
        // for(int i =0;i< arr.length;i++){
        //     if(arr[i]!=0){
        //         array[j]= arr[i];
        //         j++;
        //     }
        // }
        // for(int k =0; k < array.length;k++){
        //     arr[k]=array[k];
        // }
        
        // for(int z = array.length; z < arr.length;z++){
        //     arr[z]= 0;
        // }
        
        
        

        // int n = arr.length;
        // for(int i=0;i< n-1;i++){
        //     if(arr[i]==0){
        //     for(int j = i+1; j<n;j++) {
        //         if (arr[j] > 0) {
        //             int tmep = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = tmep;
        //             break;
        //         }
        //     }
        //     }
        // }
        
        int n = arr.length;
        int j =-1;
        for(int i =0;i < n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1) return ;

        for(int i = j+1; i < n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;

                j++;
            }
        }
    }
}
