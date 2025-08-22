class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int top =-1;
        int left =-1;
        int right =-1;
        int bottum =-1;

        x:for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    top = i;
                    break x;
                } 
            }
        }

        y:for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[j][i]==1){
                    left = i;
                    break y;
                } 
            }
        }

        z:for(int i=n-1;i>=0;i--){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    bottum = i;
                    break z;
                } 
            }
        }

        zz :for(int i=m-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(grid[j][i]==1){
                    right = i;
                    break zz;
                } 
            }
        }

        return (bottum - top + 1) *(right - left +1);
    }
}