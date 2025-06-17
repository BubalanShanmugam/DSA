class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low =0;
        int high = mat[0].length-1;
        
        int [] res = {-1,-1};
        while(low<=high){
            int mid= (low+high)/2;//col
            int row = maxincol(mat, mid);
            int left = (mid-1)>=0 ? mat[row][mid-1]:-1;
            int right = (mid+1)<mat[0].length ? mat[row][mid+1]:-1;

            if(mat[row][mid]>left && mat[row][mid]>right){
                res[0]=row;
                res[1]=mid;
                return res;
            }
            else if(mat[row][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }

    public static int maxincol(int[][] mat, int col){
        int max = -1;
        int row=-1;

        for(int i =0;i<mat.length;i++){
            if(max<mat[i][col])
            {
                max= mat[i][col];
                row =i;
            }
        }
        return row;
    }
}