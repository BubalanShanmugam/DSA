class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int xlast = x+k-1;
        // int ylast = y+k-1;
        for(int i=x;i<x+(k/2);i++){
            if(xlast == i) continue;
            for(int j=y;j<k+y;j++){
                int temp = grid[i][j];
                grid[i][j]=grid[xlast][j];
                grid[xlast][j]=temp;
            }
            xlast--;
        }
        return grid;
    }
}