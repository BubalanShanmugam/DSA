class Solution {
    public long maxMatrixSum(int[][] arr) {
        int n = arr.length;
int count = 0;
long sum = 0;
int minAbs = Integer.MAX_VALUE;

for(int i = 0; i < n; i++) {  
    for(int j = 0; j < n; j++) {  
        if(arr[i][j] < 0)  
            count++;  
        sum += Math.abs(arr[i][j]);             
        minAbs = Math.min(minAbs, Math.abs(arr[i][j]));  
    }  
}  
if(count % 2 == 1) {  
    sum -= (long)2 * minAbs;                     
}  

return sum; 
    }
}