//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            List<Integer> result = new Solution().frequencyCount(arr);

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends

// class Solution {
//     // Function to count the frequency of all elements from 1 to N in the array.
//     // Function to count the frequency of all elements from 1 to N in the array.
//     public List<Integer> frequencyCount(int[] arr) {
//         List<Integer> list = new ArrayList<>();
//         int N = arr.length;

//         // Add array elements to a list (optional, but matches your style)
//         List<Integer> listarr = new ArrayList<>();
//         for (int a : arr) {
//             listarr.add(a);
//         }

//         // Count frequency of each number from 1 to N
//         for (int i = 1; i <= N; i++) {
//             list.add(Collections.frequency(listarr, i));
            
//         }

//         return list;
//     }
// }

// class Solution {
//     // Function to count the frequency of all elements from 1 to N in the array.
//     public List<Integer> frequencyCount(int[] arr) {
//         // do modify in the given array
        
//         List<Integer> freq=new ArrayList<>();
        
//         for(int v=0;v<arr.length;v++){
//             freq.add(0);
//         }
        
//         for(int v=0;v<arr.length;v++){
//             freq.set(arr[v]-1,freq.get(arr[v]-1)+1);
//         }
//         return freq;
//     }
//

import java.util.stream.*;

class Solution{
      public List<Integer> frequencyCount(int[] arr) {
            
            int[] list = new int[arr.length];
            
            for(int i=0; i< arr.length;i++){
                list[ arr[i]-1 ] = list[ arr[i]-1 ] +1;
                // list.set(arr[i]-1, list.get(arr[i]-1)+1);
            }
            
            return  Arrays.stream(list).boxed().collect(Collectors.toList());
      }
    
}














































