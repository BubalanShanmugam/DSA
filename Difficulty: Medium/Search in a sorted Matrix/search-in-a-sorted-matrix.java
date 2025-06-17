

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = (n*m)-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            int r= mid/m;
            int c = mid%m;
            
            if(mat[r][c]==x) return true;
            else if(mat[r][c]< x) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
