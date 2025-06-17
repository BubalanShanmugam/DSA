class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int [] m : matrix){
            boolean found = bs(m,target);
            if(found) return true;;
        }
        return false;
    }

    public static boolean bs(int[] arr, int x){
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]== x) return true;
            else if(arr[mid]<x) low = mid+1;
            else high=mid-1;
        }
        return false;
    }
}