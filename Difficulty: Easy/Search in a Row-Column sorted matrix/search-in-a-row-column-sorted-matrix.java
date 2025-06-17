class Solution {
//     public static boolean matSearch(int mat[][], int x) {
//         // your code here
//         int n = mat.length;
//         int m = mat[0].length;
        
//         int low = 0;
//         int high = (n*m)-1;
        
//         while(low<=high){
//             int mid = (low+high)/2;
//             int r = mid/m;
//             int c=mid%m;
            
//             if(mat[r][c]== x) return true;
//             else if(mat[r][c] < x) low = mid+1;
//             else high = mid-1;
//         }
//         return false;
//     }


 private static boolean binarSearch(int[] arr, int key)
    {
        int low = 0, high = arr.length-1;
        
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            
            if(arr[mid]==key)
            {
                return true;
            }
            else if(key > arr[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return false;
    }
    
    public static boolean matSearch(int mat[][], int x) 
    {
        boolean isFound = false; 
        for(int[] row : mat)
        {
            isFound = binarSearch(row, x);
            
            if(isFound) return isFound;
        }
        return false;
    }
}